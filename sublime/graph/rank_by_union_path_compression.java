class Solution
{
	int n;							// no of nodes
	int[] parent= new int[n];		// stores parent node of each node 
	int[] rank= new int[n]			// stores rank of node(height of node)
	public  void make pair()
	{
		for(int i=0;i<n;i++)
		{
			parent[i]=i;
			rank[i]=0;
		}
	}

	public int findPar(int i)				// returns parent od node
	{
		if(parent[i]==i)
			return i;

		return parent[i]=findPar(parent[i]); // path compression
	}

	public void union(int a,int b)
	{
		a=findPar(a);
		b=findPar(b);
		if(rank[a]==rank[b])
		{
			parent[b]=a;
			rank[a]++
		}
		else if(rank[a]>rank[b])
		{
			parent[b]=a;
		}
		else if(rank[b]>rank[a])
		{
			parent[a]=b;
		}
	}
	public static void main(String[] args) {
		int m; // no of operations
		while(m--)
		{
			union(a,b);
		}


		if(findPar(a)!=findPar(b))
			System.out.println("different components");
		else
			System.out.println("same component");
	}
}