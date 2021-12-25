class Solution
{
	static class Trie
	{
		Trie[] children;
		boolean isEnd;

		Trie()
		{
			isEnd=false;
			children= new Trie[26];
			for(int i=0;i<26;i++)
				children[i]=null;
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
			temp=temp.children[s.charAt(i)-'a'];
		}
		temp.isEnd=true;
	}

	static boolean search(String s)
	{
		Trie temp=root;

		for(int  i=0;i<s.length();i++)
		{
			if(temp.children[s.charAt(i)-'a']==null)
				return false;
			temp=temp.children[s.charAt(i)-'a'];
		}
		return temp.isEnd;
	}
	public static void main(String[] args) {
		root= new Trie();
		String[] keys= {"apple","car","card","set","high","height"};
		for(int i=0;i<keys.length;i++)
			insert(keys[i]);

		System.out.println(search("card"));
	}
}