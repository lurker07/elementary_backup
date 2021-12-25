import java.util.*;
class Solution
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt(),m=sc.nextInt();
		int[] arr= new int[n];

		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();

		int max=1,res=1;

		for(int i=0;i<n;i++)
		{
			int r=arr[i]%m;
			int temp=arr[i]/m;
			if(r!=0)
				temp++;

			if(temp>=max)
			{	res=i+1;max=temp;}

		}

		System.out.println(res);
	}
}