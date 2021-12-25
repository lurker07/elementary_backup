import java.util.*;
class Solution
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int k=sc.nextInt();

		int[] arr= new int[m+1];
		for(int i=0;i<=m;i++)
			arr[i]=sc.nextInt();
		int res=0;
		for(int i=0;i<m;i++)
		{
			int temp=arr[i]^arr[m];
			int count=0;
			while(temp>0)
			{
				if((temp&1)==1)
					count++;
				temp>>=1;

			}
			if(count<=k)
				res++;
		}
		System.out.println( res);
	}
}