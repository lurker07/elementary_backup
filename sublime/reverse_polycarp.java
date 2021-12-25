// import java.util.*;
//  class Solution
// {
//     public static void main(String[] args)
//     {
//         Scanner sc= new Scanner(System.in);
//         int t=sc.nextInt();
//         for(int i=0;i<t;i++)
//         {
//             int n=sc.nextInt();
//             int[] l= new int[n];
//             for(int j=0;j<n;j++)
//             l[j]=sc.nextInt();
//             List<Integer> res= new ArrayList<>();
//             int low=0,high=n-1;
//             if(l[0]!=n&&l[n-1]!=n)
//                 System.out.println(-1);
//             else
//             {
//             while(low<=high)
//             {
//                 if(l[low]>l[high])
//                 {
//                     res.add(0,l[low]);
//                     low++;
//                 }
//                 else
//                 {
//                     res.add(l[high]);
//                     high--;
//                 }
//             }
            
//             for(Integer it:res)
//             System.out.print(it+" ");
//             System.out.println();
//             }
//         }
        
//     }
// }






import java.util.*;
import java.io.*;
import java.util.StringTokenizer;
 
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
         
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int[] l= new int[n];
            for(int j=0;j<n;j++)
            l[j]=sc.nextInt();
            List<Integer> res= new ArrayList<>();
            int low=0,high=n-1;
            if(l[0]!=n&&l[n-1]!=n)
                out.println(-1);
            else
            {
            // while(low<=high)
            // {
            //     if(l[low]>l[high])
            //     {
            //         res.add(0,l[low]);
            //         low++;
            //     }
            //     else
            //     {
            //         res.add(l[high]);
            //         high--;
            //     }
            // }
            
            // for(Integer it:res)
            // out.print(it+" ");
            for(int j=n-1;j>=0;j--)
                out.print(l[j]+" ");
            out.println();
            }
        } 



        out.flush();
        out.close();
    }
}