import java.util.*;
class Solution
{
	public static int count(char[] ch,char c,int pos,int n)
	{
		int temp1=0,temp2=0;
		for(int i=pos-2;i<pos+3;i++)
		{
			if(i>=0&&i<n)
			{
			if(ch[i]=='a')
			{
				if(i+1<n&&i+2<n&&ch[i+1]=='b'&&ch[i+2]=='c')
					temp1++;
			}
			}
		}

		ch[pos]=c;
		for(int i=pos-2;i<pos+3;i++)
		{
			if(i>=0&&i<n)
			{
			if(ch[i]=='a')
			{
				if(i+1<n&&i+2<n&&ch[i+1]=='b'&&ch[i+2]=='c')
					temp2++;
			}
			}
		}
		//System.out.println(temp1+" "+temp2);

		return temp2-temp1;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int q=sc.nextInt();

		String s=sc.next();
		char [] ch= s.toCharArray();

		int temp=0;
		for(int i=0;i<n;i++)
		{
			if(ch[i]=='a')
			{
				if(i+1<n&&i+2<n&&ch[i+1]=='b'&&ch[i+2]=='c')
					temp++;
			}
		}

		//System.out.println(temp);
		for(int i=0;i<q;i++)
		{
			int k=sc.nextInt();
			char c=sc.next().charAt(0);
			System.out.println(temp=temp+count(ch,c,k-1,n));
		}
	}
}