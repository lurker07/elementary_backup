import java.util.*;
class MyComparator implements Comparator<Integer>
{
	public int compare(Integer a,Integer b)
	{
		return a-b;
	}
}
class Solution
{
	public static List<Integer> maxSubarray(int[] arr,int k)
	{
		List<Integer> res= new ArrayList<>();
		PriorityQueue<Integer> q= new PriorityQueue<>(new MyComparator());
		for(int i=0;i<k;i++)
			q.add(arr[i]);
		res.add(q.poll())
		q.remove(arr[0]);

		for(int i=k;i<n;i++)
		{
			q.add(arr[i]);
			res.add(q.poll());
			q.remove(arr[i-k+1]);
		}
		return res;
	}

	public static void main(String[] args) {
		int[] arr={12, 1, 78, 90, 57, 89, 56 };
		List<Integer> l= maxSubarray(arr,3);
		System.out.println(l);
	}
}