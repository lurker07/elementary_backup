class Node
{
	int data;
	Node left;
	Node right;

	Node(int data)
	{
		this.data=data;
		left=null;
		right=null;
	}
}

class Solution
{
	public static void arrTOMinHeap(Node root,ArrayList l)
	{
		if(root==null)
			return ;
		root.data=l.removeFirst();
		arrTOMinHeap(root.left,l);
		arrTOMinHeap(root.right,l);
	}

	public static void bstToArr(Node root,ArrayList l)
	{
		if(root==null)
			return ;
		bstToArr(root.left,l);
		l.add(root.data);
		bstToArr(root.right,l);
	}

	public static void convertToMinHeap(Node root)
	{
		ArrayList<Integer> l= new ArrayList<>();
		bstToArr(root,l);

		arrTOMinHeap(root,l);
	}

	public static void main(String[] args) {
	Node root = new Node(4);
    root.left = new Node(2);
    root.right = new Node(6);
    root.left.left = new Node(1);
    root.left.right = new Node(3);
    root.right.left = new Node(5);
    root.right.right = new Node(7);
    
    convertToMinHeap(root);
    
	}
}