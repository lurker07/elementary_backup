import java.io.*;
import java.util.*;

class Solution {
    
    static class Node
{
    int val;
    int index;

    Node(int val,int index)
    {
        this.val=val;this.index=index;
    }
} 


    static class FastReader {
 
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
 
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() {
            return Integer.parseInt(next());
        }
 
        long nextLong() {
            return Long.parseLong(next());
        }
 
        double nextDouble() {
            return Double.parseDouble(next());
        }
 
        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

     public static boolean canReach(String s, int min, int max) {
        char[] c= s.toCharArray();
        int n=s.length();
        boolean[] res= new boolean[n];
        if(c[n-1]=='1')
            return false;
        res[0]=true;
        for(int i=1;i<n;i++)
        {
            for(int j=min;j<=max;j++)
            {
                if((i-j)>=0&&c[i-j]=='0')
                    res[i]=true;
            }
        }
        for(boolean i:res)
            System.out.print(i+" ");
        System.out.println();
        return res[n-1];
    }
 
    public static void main(String[] args) {
 
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
 
        FastReader sc = new FastReader();
 
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int max=Integer.MIN_VALUE;
            int arr[]= new int[n];
            for(int j=0;j<n;j++)
                max=Math.max(max,arr[j]=sc.nextInt());

            int[] res= new int[n];
            Stack<Node> st= new Stack<>();
            for(int j=0;j<n;j++)
            {
                if(st.isEmpty())
                    res[j]=-1;
                else if(st.size()>0&&st.peek().val>arr[j])
                    res[j]=st.peek().index;
                else if(st.size()>0&&st.peek().val<=arr[j])
                {
                    while(st.size()>0&&st.peek().val<=arr[j])
                        st.pop();
                    if(st.size()>0)
                        res[j]=st.peek().index;
                    else
                        res[j]=-1;
                }
                st.add(new Node(arr[j],j));
            }
            int count=0;
                // for(int it:res)
                //     out.print(it+" ");
                // out.println("==========");
            int j=n-1;
            while(true)
            {
                if(res[j]==-1)
                    {
                        out.println(count);
                        break;
                    }
                    else if(res[j]==max)
                    {
                        count++;
                        out.println(count);
                        break;
                    }
                else 
                    {
                        count++;
                        j=res[j];
                    }
            }
        }       


        out.flush();
        out.close();
    }
}