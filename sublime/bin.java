import java.util.*;

class Solution {
    public static int solve(int[] nums) {
        int n=nums.length,count=0,neg=0;
        long product=1l;
        int max=0;

        for(int i=0;i<n;i++)
        {
            if(nums[i]!=0)
            {
                product*=nums[i];
                count++;
                if(product>0)
                    max=Math.max(max,count);
                else
                {if(nums[i]<0)
                    neg=i+1;
                    max=Math.max(max,count-neg);
                }
            }
            else
            {
                if(product>0)
                max=Math.max(max,count);
                count=0;
                product=1l;
            }
            
        }
        return max;
    }

    public static void main(String[] args) {
        // int[] a={-1, 1, 2, -1, 1, 0, 1};
        //int[] a={-1,-1,-1,2,3,4,2,3,3,2,2,-2,2,-2,2,-2,0,2,3,3,3,2,3,3,2,-2,-2,3,0,3};
        int[] a={-1};
        System.out.println(solve(a));
    }
}