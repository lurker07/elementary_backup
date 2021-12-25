import java.util.*;
class Node
{
    int data;
    Node next;
    
    Node(int key)
    {
        data = key;
        next = null;
    }

    public String toString()
    {
    	return data+"->";
    }
}
class Solution
{
	static Node mergeKList(Node[]arr,int K)
    {
        PriorityQueue<Node> pq= new PriorityQueue<>((a,b)->(a.data-b.data));
        for(int i=0;i<K;i++)
        {
            pq.add(arr[i]);
        }
        System.out.println(pq);
        Node res= pq.poll();
        Node temp=res;
        if(temp.next!=null)
        pq.add(temp.next);
        System.out.println(pq);
        while(pq.size()>0)
        {
            temp.next=pq.poll();
            temp=temp.next;
            if(temp.next!=null)
            pq.add(temp.next);
        }
        return res;
    }

	public static void main(String[] args) {
		Node[] arr= new Node[4];
		arr[0]= new Node(1);
		arr[1]= new Node(4);
		arr[2]= new Node(5);
		arr[3]= new Node(7);

		arr[0].next= new Node(2);
		arr[0].next.next= new Node(3);

		arr[1].next= new Node(5);


		arr[2].next= new Node(6);

		arr[3].next= new Node(8);

		Node res=mergeKList(arr,4);

	}
}