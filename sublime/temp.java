import java.io.*;
import java.util.*;
 
class Solution {
 
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
 
        


        out.flush();
        out.close();
    }
}