import java.util.*;
public class prog
{


	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			int count=0;
			while(true)
			{
				if(a>=1&&b>=1&&(a+b+0l)>=4)
				{
					count++;
					if(a<b)
					{
						a-=1;
						b-=3;
					}
					else
					{
						b-=1;
						a-=3;
					}
				}
				else
				{
					break;
				}
			}
			System.out.println(count);
		}
	}
}