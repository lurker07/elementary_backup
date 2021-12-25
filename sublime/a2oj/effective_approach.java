import java.util.*;
class Solution
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr= new int[n+1];

		for(int i=0;i<n;i++)
			arr[sc.nextInt()]=i+1;

		long c1=0l,c2=0l;
		int m=sc.nextInt();
		for(int i=0;i<m;i++)
		{
			int num=sc.nextInt();
			c1+=arr[num];
			c2+=n-arr[num]+1;
		}
		System.out.println(c1+" "+c2);
	}
}