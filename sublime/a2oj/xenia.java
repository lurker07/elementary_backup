import java.util.*;
class Solution
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();

		int[] arr= new int[m];
		for(int i=0;i<m;i++)
			arr[i]=sc.nextInt();

		int start=1,end=1;
		long count=0l;
		for(int i=0;i<m;i++)
		{
			end=arr[i];
			if(end>=start)
				count+=(end-start);
			else
				count+=end+n-start;
			start=arr[i];
		}
		System.out.println(count);
	}
}