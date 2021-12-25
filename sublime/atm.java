import java.util.*;
class Solution
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		for(int k=0;k<t;k++)
		{
			int n=sc.nextInt(),s=sc.nextInt();
			int[] arr= new int[n];

			for(int i=0;i<n;i++)
				arr[i]=sc.nextInt();

			long temp=s+0l;

			int start=0,end=-1,x=,y=-1;

			for(int i=0;i<n;i++)
			{
				if(temp+arr[i]<0)
				{
					temp=s+0l;
					if((y-x+1)>(end-start+1))
					{
						start=x;
						end=y;
					}

						x=0;
						y=-1;
				}
				else
				{
					temp=temp+arr[i];
					if(y==-1)
					{
						x=i;
						y=i;
					}
					else
						y=i;
				}
			}

			if((y-x+1)>(end-start+1))
					{
						start=x;
						end=y;
					}

			if((end-start+1)==0)
				System.out.println(-1);
			else
			System.out.println((start+1)+" "+(end+1));
		}
	}
}

































// import java.util.*;
//  class Solution
// {
// 	public static void main(String[] args) {
// 		Scanner sc= new Scanner(System.in);
// 		int t=sc.nextInt();
// 		for(int i=0;i<t;i++)
// 		{
// 			int n=sc.nextInt();
// 			int s=sc.nextInt();

// 			long[] arr= new long[n];
// 			long max=0;
// 			long start=-1,end=-1;

// 			for(int j=0;j<n;j++)
// 				arr[j]=sc.nextLong();

// 			long[] array=new long[n+1];
// 			array[0]=0l;
// 			long temp=s+0l;
// 			for(int j=1;j<=n;j++)
// 			{

// 					if(temp+arr[j-1]>=0l)
// 					{
// 						array[j]=array[j-1]+1l;
// 						temp+=arr[j-1]+0l;
// 						if(array[j]>max)
// 						{
// 							start=j-array[j]+1l;
// 							end=j;
// 							max=array[j];
// 						}
// 					}
// 					else
// 					{
// 						array[j]=0l;
// 						temp=s+0l;
// 					}
				
// 			}
// 			if(max>0)
// 				System.out.println(start+" "+end);
// 			else
// 				System.out.println("-1");

// 		}
// 	}
// }