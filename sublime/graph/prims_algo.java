class Node
{
	int node;
	int weight;

	Node(int node,int weight)
	{
		this.node=node;
		this.weight=weight;
	}
}
class Solution
{
	public static void prims(int n,List<List<Node>> adj)
	{
		int[] key= new int[n];	//stores shortest edge weight of a node
		int[] parent= new int[n];//stores parent node 
		boolean[] mst= new boolean[n];//tells if node is part of mst or not

		for(int i=0;i<n;i++)
		{
			key[i]=Integer.MAX_VALUE;
			parent[i]=-1;
		}

		key[0]=0;
		PriorityQueue<Node> q= new PriorityQueue<>((a,b)->(a.weight-b.weight));
		q.add(new Node(0,0));

		for(int i=0;i<n-1;i++)
		{
			Node temp=q.poll();
			mst[temp.node]=true;

			for(Node it:adj.get(temp.node))
			{
				if(mst[it.node]==false&&key[it.node]>it.weight)
				{
					key[it.node]=it.weight;
					parent[it.node]=temp.node;
					q.add(new Node(it.node,key[it.node]));
				}
			}
		}

		for(int i=1;i<n;i++)		// to print mst
			System.out.println(parent[i]+"->"+i);
	}

	public static void main(String[] args) {
		prims(n,adj);
	}
}