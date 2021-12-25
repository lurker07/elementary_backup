class Solution
{
	static class Trie
	{
		Trie children[];
		boolean isEnd;

		Trie()
		{
			children= new Trie[26];
			for(int i=0;i<26;i++)
				children[i]=null;
			isEnd=false;
		}
	}

	static Trie root;

	public static void insert(String s)
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

		for(int i=0;i<s.length();i++)
		{
			if(temp.children[s.charAt(i)-'a']==null)
				return false;
			temp=temp.children[s.charAt(i)-'a'];
		}
		return temp.isEnd;
	}

	static boolean wordBreak(String s)
	{
		if(s.length()==0)
			return true;
		for(int i=1;i<=s.length();i++)
		{
			if(search(s.substring(0,i))&&(wordBreak(s.substring(i,s.length()))))
				return true;
		}

		return false;
	}

	public static void main(String[] args) {
		root= new Trie();
		String[] dictionary={"mobile", "samsung",
                            "sam", "sung", "ma",
                            "mango", "icecream", 
                            "and", "go", "i", "like",
                            "ice", "cream"};

        for(String s:dictionary)
        	insert(s);

        String[] query= {"ilikesamsung","iiiiiiii","","ilikelikeimangoiii","samsungandmango","samsungandmangok"};

        for(String s:query)
        {
        	System.out.println(wordBreak(s));
        }
	}
}