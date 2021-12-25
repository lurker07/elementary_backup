import java.util.*;
class Solution
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t=Integer.parseInt(sc.nextLine().trim());
		for(int i=0;i<t;i++)
		{
			//System.out.println(i);
			// int n=sc.nextInt();
			// int k=sc.nextInt();
			String[] ch=sc.nextLine().split(" ");
			int n=Integer.parseInt(ch[0]);
			int k=Integer.parseInt(ch[1]);
			String s=sc.nextLine().trim();

			int len=s.length(),count=0;
			

			int low=0,high=n-1;
			while(low<high)
			{
				if(s.charAt(low)!=s.charAt(high))
					count++;
				low++;
				high--;
			}

			if(count==k)
				System.out.println("Case #"+(i+1)+": "+0);
			else if(k>count)
				System.out.println("Case #"+(i+1)+": "+(k-count));
			else
				System.out.println("Case #"+(i+1)+": "+(count-k));
				
		}
	}
}