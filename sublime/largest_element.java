import java.util.*;

class Solution {
    public static int solve(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==1)

                {
                    boolean flag=true;
                    for(int row=0;row<n;row++)
                    {
                        System.out.println("row");
                        if(row!=i&&matrix[row][j]!=0)
                        {

                            flag=false;
                            break;
                        }
                    }
                    if(flag)
                    {
                        for(int col=0;col<m;col++)
                        {
                            System.out.println(i+" "+j+" "+matrix[i][col]);
                            if(col!=j&&matrix[i][col]!=0)
                            {
                                flag=false;
                                break;
                            }
                        }
                    }
                    if(flag)
                    {
                        System.out.println(i+" "+j);
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] a={{1,1}};
        System.out.println(solve(a));
    }
}