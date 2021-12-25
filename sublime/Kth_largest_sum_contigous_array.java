import java.util.*;
class Solution
{
	public static int kthLargestSum(int[] arr,int n,int k)
	{
		int[] sum=new int[n+1];
		sum[0]=0;
		for(int i=1;i<=n;i++)
			sum[i]=sum[i-1]+arr[i-1];

		PriorityQueue<Integer> q= new PriorityQueue<>();
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				int temp=sum[j]-sum[i-1];

				if(q.size()<k)
					q.add(temp);
				else
				{
					if(q.peek()<temp)
					{
						q.poll();
						q.add(temp);
					}
				}
			}
		}

		return q.peek();
	}

	public static void main(String[] args) {
		int[] arr= {20, -5, -1};
		int n=arr.length;
		int k=3;

		System.out.println(kthLargestSum(arr,n,k));
	}
}