/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Pair
{
    char ch;
    int f;
    
    Pair(char ch,int f)
    {
        this.ch=ch;
        this.f=f;
    }
}
class GFG {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		int t=Integer.parseInt(sc.nextLine().trim());
		for(int j=0;j<t;j++)
		{
		    String s=sc.nextLine().trim();
		    int[] map= new int[26];
		    for(int i=0;i<s.length();i++)
		    map[s.charAt(i)-'a']++;
		    
		    PriorityQueue<Pair> pq= new PriorityQueue<>((a,b)->(b.f-a.f));
		    for(int i=0;i<26;i++)
		    {
		        if(map[i]>0)
		        {
		            pq.add( new Pair((char)('a'+i),map[i]));
		        }
		    }
		    StringBuilder res= new StringBuilder();
		    Pair block=pq.poll();
		    res.append(block.ch);
		    block.f--;
		    while(pq.size()>0)
		    {
		        Pair temp=pq.poll();
		        res.append(temp.ch);
		        temp.f--;
		        if(block.f>0)
		        pq.add(block);
		        block=temp;
		    }
		    //System.out.println(res);
		    if(block.f>0)
		    System.out.println("0");
		    else
		    System.out.println("1");
		}
	}
}