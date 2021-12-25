import java.util.*;
class Solution
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		HashMap<Integer,List<Integer>> x= new HashMap<>();
		HashMap<Integer,List<Integer>> y= new HashMap<>();
		
		int[][]arr= new int[n][2];
		for(int i=0;i<n;i++)
		{
			arr[i][0]=sc.nextInt();
			arr[i][1]=sc.nextInt(); 
			if(!x.containsKey(arr[i][0]))
				{
					List<Integer> l= new ArrayList<>();
					l.add(arr[i][1]);
					x.put(arr[i][0],l);
				}
			else
				x.get(arr[i][0]).add(arr[i][1]);


			if(!y.containsKey(arr[i][1]))
				{
					List<Integer> l= new ArrayList<>();
					l.add(arr[i][0]);
					y.put(arr[i][1],l);
				}
			else
				y.get(arr[i][1]).add(arr[i][0]);
		}

		int count=0;
		for(int[] it:arr)
		{
			List<Integer> l=x.get(it[0]);
			Collections.sort(l);
			int low=0,high=l.size()-1,res=-1;
			while(low<=high)
			{
				int mid=(low+high)/2;
				if(l.get(mid)==it[1])
				{
					res=mid;
					break;
				}
				else if(l.get(mid)<it[1])
					low=mid+1;
				else
					high=mid-1;
			}
			if(res>0&&res<(l.size()-1))
			{
				List<Integer> ll=y.get(it[1]);
				Collections.sort(ll);
				int low1=0,high1=ll.size()-1,temp=-1;
				while(low1<=high1)
				{
					int mid=(low1+high1)/2;
					if(ll.get(mid)==it[0])
					{
						temp=mid;
						break;
					}
					else if(ll.get(mid)<it[0])
						low1=mid+1;
					else
						high1=mid-1;
				}
				
				if(temp>0&&temp<(ll.size()-1))
					count++;
			}
			else
			{}
		}
		System.out.println(count);
	}
}