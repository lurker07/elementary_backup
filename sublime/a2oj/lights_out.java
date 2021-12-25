import java.util.*;
class Solution
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[][] arr= new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				arr[i][j]=(sc.nextInt()&1);
		}

		int[][] res= new int[3][3];
		for(int[] it:res)
		Arrays.fill(it,1);

		for(int  i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(arr[i][j]==1)
				{
					
						res[i][j]=1-res[i][j];
					if(i-1>=0)
						res[i-1][j]=1-res[i-1][j];
					if(i+1<3)
						res[i+1][j]=1-res[i+1][j];
					if(j-1>=0)
						res[i][j-1]=1-res[i][j-1];
					if(j+1<3)
						res[i][j+1]=1-res[i][j+1];
				}
			}
		}

		for(int[] r:res)
		{
			for(int it:r)
				System.out.print(it);
			System.out.println();
		}
	}
}