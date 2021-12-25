import java.util.*;
class Edge
{
	int destination;
	int distance;

	Edge(int destination,int distance)
	{
		this.destination=destination;
		this.distance=distance;
	}
}
class Solution
{
	public static void print(List<List<Edge>> adj)
	{
		for(int i=0;i<adj.size();i++)
		{
			System.out.print("edges for node "+i+" => ");
			for(Edge it:adj.get(i))
			{
				System.out.print("("+it.destination+","+it.distance+") ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter no of vertices ");
		int n=sc.nextInt();
		List<List<Edge>> adj= new ArrayList<>();
		for(int i=0;i<n;i++)
			adj.add(new ArrayList<Edge>());

		System.out.println("enter edges as source destination distance");
		System.out.println("enter the no of edges");
		int e=sc.nextInt();
		for(int i=0;i<e;i++)
		{
			int src=sc.nextInt();
			int destination=sc.nextInt();
			int distance=sc.nextInt();
			adj.get(src.add(new Edge(destination,distance)));
		}

		print(adj);
	}
}