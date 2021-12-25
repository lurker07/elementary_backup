import java.util.*;
class Solution
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int[] arr= new int[n];
		for(int i=0;i<n;i++)
			sum+=(arr[i]=sc.nextInt());

		n++;int count=0;
		for(int i=1;i<6;i++)
		{import java.util.*;
class Solution
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int[] arr= new int[n];
		for(int i=0;i<n;i++)
			sum+=(arr[i]=sc.nextInt());

		n++;int count=0;
		for(int i=1;i<6;i++)
		{
			if((sum+i)%n!=1)
				count++;
		}

		System.out.println(count);
	}
}
			if((sum+i)%n!=1)
				count++;
		}

		System.out.println(count);
	}
}