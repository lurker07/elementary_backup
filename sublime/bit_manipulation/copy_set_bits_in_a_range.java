import java.util.*;
class Solution
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int l=sc.nextInt();
		int r=sc.nextInt();

		int mask=(1<<(r-l+1))-1;   //make r-l+1 bits 1

		mask=mask<<(left-1);       //shift set bits to create mask

		mask=mask&y;

		x=x|mask;

		System.out.println(x);
	}
}