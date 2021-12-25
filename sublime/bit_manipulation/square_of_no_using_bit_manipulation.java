import java.util.*;
/*approach 1 -> every no can be expressed as n=2*xorn=2*x+1
				(2*x)*(2*x)=4x*x
				(2*x+1)*(2*x+1)=4*x*x+4*x+1
*/

class Solution
{
	public static int square(int n)
	{
		if(n==0)
			return 0;
		if(n<0)
			n=-n;

		int x=n>>1;					//n=2*x+1;

		if((n&1)==1)
			return ((square(x)<<2)+ (x<<2)+1);
		else
			return (square(x)<<2);
	}

	public static void main(String[] args) {
		System.out.println(square(25));
	}
}

/* approach 2 ->n*n can be written as n*2power i+.................*/
/*


class Solution
{
	public static int square(int n)
	{
		if(n<0)
			n=-n;

		int result=0,temp=n;

		while(temp>0)
		{
			int i=0;
			while((1<<i)<=temp)							//calculating highest power of two in temp
				i++;			
				i--;							
			result=result+(n<<i);
			temp=temp-(1<<i);
		}

		return result;
	}

	public static void main(String[] args) {
		System.out.println(square(15));
	}
}
*/