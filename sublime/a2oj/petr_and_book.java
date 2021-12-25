import java.util.*;
class Solution
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr= new int[7];
		for(int i=0;i<7;i++)
			arr[i]=sc.nextInt();

		for(int i=1;i<7;i++)
			arr[i]=arr[i]+arr[i-1];

		if(n%arr[6]==0)
		{
			for(int i=0;i<7;i++)
			{
				if(arr[i]==arr[6])
				{
					System.out.println(i+1);
					break;
				}
			}
		}
		else
		{
			int r=n%arr[6];
			for(int i=0;i<7;i++)
			{
				if(arr[i]>=r)
				{
					System.out.println(i+1);
					break;
				}
			}
		}
	}
}