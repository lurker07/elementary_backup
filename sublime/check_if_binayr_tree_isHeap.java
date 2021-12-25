class Solution
{
	// approach 1-> MY approach at gfg
	 boolean isHeap(Node tree) {
        // code here
        if(tree==null)
        return true;
        else if(tree.left==null&&tree.right!=null)
        return false;
        else if(tree.left!=null&&tree.right!=null&&
        ((tree.left.left==null||tree.left.right==null)&&
        (tree.right.left!=null||tree.right.right!=null)))
        return false;
        else if(tree.left!=null&&tree.data<tree.left.data)
        return false;
        else if(tree.right!=null&&tree.data<tree.right.data)
        return false;
        else
        return isHeap(tree.left)&isHeap(tree.right);
        //return true;
    }

    // approach 2-> 
    int size(Node tree)
    {
    	if(tree==null)
    		return 0;
    	else
    		return 1+size(tree.left)+size(tree.right);
    }

    boolean checkHeap(Node tree,int n,int i)
    {
    	if(tree==null)
    		return true;
    	if((tree.left!=null&&tree.left.data>=tree.data)||(tree.right!=null&&tree.right.data>=tree.data))
    		return false;
    	else if(i>=n)    // to check if tree is complete binary tree or not
    		return false;
    	else 
    		return checkHeap(tree.left,n,2*i+1)&&checkHeap(tree.right,n,2*i+2);
    }

    boolean isHeap(Node tree)
    {
    	if(tree==null)
    		return true;
    	int n=size(tree);
    	return checkHeap(tree,n,0)
    }
}