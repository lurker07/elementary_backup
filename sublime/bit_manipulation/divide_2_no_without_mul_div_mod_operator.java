// Divide two integers without using multiplication, division and mod operator

/* two approach -> first is two subtract the divisor from dividend and return the count of no of times 
				   it is subtracted. This approach is inefficient as if divisor is small and dividend is large
				   it would be slow

				   Second approcah is to use bit manipulation.

				   pior knowledge required is when we left shift bits of a number we multiply it by power of 2
				   for eg (n<<i) means n*(2 raised to the power of i)

				   approach => we can write 
				   dividend=divisor*quotient+remainder

				   when we neglect remainder equation becomes
				   dividend>=divisor*quotient

				   as we can express every no in terms of power of 2
				   we can write quotient as 2^i+2^(i-1)+.......


Approach 2 program ->

*/
import java.util.*;
class Solution
{

	public static int divide(int a,int b)
	{
		long dividend=a*1l;
		long divisor=b*1l;

		long quotient=0l,temp=0l;
		int sign=((a<0)^(b<0))?-1:1;

		dividend=Math.abs(dividend);
		divisor=Math.abs(divisor);

		for(int i=31;i>=0;i--)
		{
			if(temp+(divisor<<i)<=dividend)
			{
				temp+=(divisor<<i);
				quotient+=(1l<<i);
			}
		}

		if(sign==-1)
			return (int)-quotient;
		return (int)quotient;

	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();

		System.out.println(divide(a,b));
	}
}