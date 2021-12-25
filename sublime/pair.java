// import java.util.*;
// class Solution
// {
// 	public static void main(String[] args) {
// 		Scanner sc= new Scanner(System.in);
// 		int t=sc.nextInt();

// 		for(int i=0;i<t;i++)
// 		{
// 			int n=sc.nextInt();

// 			int[] arr= new int[n];
// 			for(int j=0;j<n;j++)
// 			{
// 				arr[j]=sc.nextInt();
// 			}


// 			Arrays.sort(arr);
// 			int count=0;
// 			for(int j=1;j<n&&count<n/2;j++)
// 			{
// 				System.out.println(arr[j]+" "+arr[0]);
// 				count++;
// 			}
// 		}
// 	}
// }


import java.io.*;
import java.util.StringTokenizer;
 
class temp {
 
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

 			int[] arr= new int[n];
 			for(int j=0;j<n;j++)
 			{
 				arr[j]=sc.nextInt();
 			}

 			int min=Integer.MAX_VALUE;
 			for(int j=0;j<n;j++)
 			{
 				if(arr[j]<min)
 					min=arr[j];
 			}
			int count=0;
 			for(int j=0;j<n&&count<n/2;j++)
 			{
 				if(arr[j]==min)
 					continue;
 				out.println(arr[j]+" "+min);
 				count++;
 			}
 		}
 
 
 
        out.flush();
        out.close();
    }
}