import java.util.*;
class Solution
{
	public static boolean check(String s)
	{
		Set<Character> set= new HashSet<>();
		for(int i=0;i<4;i++)
			set.add(s.charAt(i));
		if(set.size()==4)
			return true;
		return false;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s= sc.next();
		int year=Integer.parseInt(s);
		year++;
		while(!check(year+""))
			year++;
		System.out.println(year);
	}
}