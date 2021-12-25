import java.util.*;
public class chocolates
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			int l= sc.nextInt();
			int r= sc.nextInt();
			int k=sc.nextInt();

			List<Integer> list= new ArrayList<>();
			for(int j=0;j<n;j++)
			{
				int temp=sc.nextInt();
				if(temp>=l&&temp<=r)
					list.add(temp);
			}

			Collections.sort(list);
			long sum=0l;int count=0;
			for(Integer it:list)
				{
					if((sum+it)<=k)
					{
						count++;
						sum+=it;
					}
				}
			System.out.println(count);

		}
	}
}