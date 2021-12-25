import java.util.*;
class Solution
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			if((n&1)==1)
			{
				String s=n+"";
				int len=s.length();
				if(len==1)
				{
					System.out.println("-1");
					continue;
				}
				int r=n/((int)Math.pow(10,len-1));
				if((r&1)==0)
					System.out.println("1");
				else
				{
					int count=0;
					while(n>0)
					{
						int tmp=n%10;
						if((tmp&1)!=1)
						{
							count++;
							System.out.println("2");
							break;
						}
						n/=10;
					}
					if(count==0)
						System.out.println("-1");
				}
			}
			else
				System.out.println("0");
		}
	}
}