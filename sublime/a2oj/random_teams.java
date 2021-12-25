    import java.util.*;
    public class Solution
    {
    	public static long sum(long n)
    	{
    		return n*(n+1)/2;
    	}
    	public static void main(String[] args) {
    		Scanner sc= new Scanner(System.in);
    		int n=sc.nextInt();
    		int m=sc.nextInt();
     
    		long min=0l,max=0l;
     
    		long temp=0l;
    		if(n%m==0)
    		{
    			temp=n/m*1l;
    			min=m*(temp*(temp-1)/2);
    		}
    		else
    		{
    			long n1=n+0l,m1=m+0l;
    			long count=0l;
    			while(n1%m1!=0)
    			{
    				long r=n1%m1;
    				count+=sum(r-1);
    				n1-=r;
    				m1--;
    			}
     
    			temp=n1/m1;
    			min=m1*(temp*(temp-1)/2);
     
    			min+=count;
    			
    		}
     
    		temp=n-m+1l;
    		max=(temp*(temp-1)/2);
     
    		System.out.println(min+" "+max);
     
    	}
    }