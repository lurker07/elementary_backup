import java.util.*;
class Matrix
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int res=0;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				int tmp=sc.nextInt();
				if(tmp==1)
				{
					res=Math.abs(2-i)+Math.abs(2-j);
				}
			}
		}
		System.out.println(res);
	}
}