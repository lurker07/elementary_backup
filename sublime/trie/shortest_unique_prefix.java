class Solution
{
	static class Trie
	{
		Trie[]  children;
		boolean isEnd;
		int freq;

		Trie()
		{
			isEnd=false;
			freq=1;
			children= new Trie[26];
			for(int i=0;i<26;i++)
			{
				children[i]=null;
			}
		}
	}

	static Trie root;

	static void insert(String s)
	{
		Trie temp=root;
		for(int i=0;i<s.length();i++)
		{
			if(temp.children[s.charAt(i)-'a']==null)
				temp.children[s.charAt(i)-'a']= new Trie();
			else 
				temp.children[s.charAt(i)-'a'].freq++;
			temp=temp.children[s.charAt(i)-'a'];
		}
		temp.isEnd=true;
	}

	static void prefix(Trie temp,char[] ch,int i)
	{
		if(temp==null)
			return;
		if(temp.freq==1)
		{
			ch[i]='\0';
			int j=0;
			while(ch[j]!='\0')
				System.out.print(ch[j++]);
			System.out.println();
			return;
		}
		for(int j=0;j<26;j++)
		{
			if(temp.children[j]!=null)
			{
				ch[i]=(char)('a'+j);
				prefix(temp.children[j],ch,i+1);
			}
		}
	}

	public static void main(String[] args) {
		root= new Trie();
		root.freq=0;
		String[] arr={"zebra", "dog", "duck", "dove","doze","zeta","apple"};
		for(String s:arr)
			insert(s);
		char[] ch=new char[500];

		prefix(root,ch,0);		
	}
}