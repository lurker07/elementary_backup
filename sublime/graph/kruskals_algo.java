class Node
{
	int a;
	int b;
	int weight;

	Node(int a,int b,int weight)
	{
		this.a=a;
		this.b=b;
		this.weight=weight;
	}
}
class Solution
{
	public static int findPar(int node,int[] parent)
	{
		if(node==parent[node])
			return node;
		return parent[node]=findPar(parent[node],parent);
	}

	public static void union(int a,int b,int[] parent,int [] rank)
	{
		a=findPar(a,parent);
		b=findPar(b,parent);

		if(rank[a]==rank[b])
		{
			rank[b]++;
			parent[a]=b;
		}
		else if(rank[a]>rank[b])
			parent[b]=a;
		else if(rank[b]>rank[a])
			parent[a]=b;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no of nodes");
		int n=sc.nextInt();

		System.out.println("enter the no of edges");
		int e=sc.nextInt();

		List<Node> adj= new ArrayList<>();

		for(int i=0;i<e;i++)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			int weight=sc.nextInt();
			adj.add(new Node(a,b,weight));	
		}

		int [] parent= new int[n];
		int rank[]= new int[n];

		for(int i=0;i<n;i++)
		{
			rank[i]=0;
			parent[i]=i;
		}

		Collections.sort(adj,(a,b)->(a.weight-b.weight));
		int cost=0;
		ArrayList<Node> res= new ArrayList<>();

		for(Node it:adj)
		{
			if(findPar(it.a,parent)!=findPar(it.b,parent))
			{
				cost+=it.weight;
				union(it.a,it.b,parent,rank);
				res.add(it);
			}
		}

		for(Node it:res)
		{
			System.out.println(it.a+" "+it.b+" "+it.weight);
		}
	}
}	