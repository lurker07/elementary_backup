import java.util.*;
class Solution
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			String x1=sc.next();
			int p1=sc.nextInt();
			String x2=sc.next();
			int p2=sc.nextInt();

			int num1=x1.length()+p1;
			int num2=x2.length()+p2;

			if(num1>num2)
				System.out.println(">");
			else if(num1<num2)
				System.out.println("<");
			else
			{
				if(p1==p2)
				{
					int temp1=Integer.parseInt(x1);
					int temp2=Integer.parseInt(x2);

					if(temp1>temp2)
					System.out.println(">");
					else if(temp1<temp2)
					System.out.println("<");
					else
					System.out.println("=");
				}
				else
				{
					if(p1>p2)
					{
						String temp="";
						int no=x2.length()-x1.length();
						for(int j=0;j<no;j++)
							temp+="0";
						
						int temp1=Integer.parseInt(x1+temp);
						int temp2=Integer.parseInt(x2);

						if(temp1>temp2)
						System.out.println(">");
						else if(temp1<temp2)
						System.out.println("<");
						else
						System.out.println("=");

					}
					else
					{
						String temp="";
						int no=x1.length()-x2.length();
						for(int j=0;j<no;j++)
							temp+="0";
						
						int temp1=Integer.parseInt(x1);
						int temp2=Integer.parseInt(x2+temp);

						if(temp1>temp2)
						System.out.println(">");
						else if(temp1<temp2)
						System.out.println("<");
						else
						System.out.println("=");
					}
				}
			}

		}
	}
}