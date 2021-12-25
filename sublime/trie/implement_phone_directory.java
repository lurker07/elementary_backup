import java.util.*;
class Solution{
    
    static class Trie
    {
        Trie[] children;
        boolean isEnd;
        
        Trie()
        {
            children= new Trie[26];
            isEnd=false;
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
    
    static void prefix(Trie temp,StringBuffer sb,String s,int i,ArrayList<String> l)
    {
        if(temp==null)
        return ;
        if(sb.length()<i+1)
        {
            int index=s.charAt(sb.length())-'a';
            if(temp.children[index]==null)
            return;
            else
            sb.append(s.charAt(sb.length()));
            temp=temp.children[index];
            prefix(temp,sb,s,i,l);

        }
        else
        {
            if(temp.isEnd==true)
            {
                l.add(sb.toString());
            }
            for(int j=0;j<26;j++)
            {
                if(temp.children[j]!=null)
                {StringBuffer tempsb=new StringBuffer(sb);
                sb.append((char)(j+'a'));
                prefix(temp.children[j],sb,s,i,l);
                sb=tempsb;
                }
            }
        }
    }
    static void search(String s,ArrayList<ArrayList<String>> res)
    {
        Trie temp=root;
        for(int i=0;i<s.length();i++)
        {
            ArrayList<String> l= new ArrayList<>();
            prefix(temp,new StringBuffer(),s,i,l);
            if(l.size()==0)
            {
              l.add("0");
              res.add(l);
            }
            else
            res.add(l);
        }
    }
    
    static ArrayList<ArrayList<String>> displayContacts(int n, 
                                        String contact[], String s)
    {
        root= new Trie();
        for(int i=0;i<n;i++)
        insert(contact[i]);
        ArrayList<ArrayList<String>> res= new ArrayList<>();
        search(s,res);
        return res;
        
    }
    public static void main(String[] args) {
        String[] arr={"geeikistest", "geeksforgeeks", 
                      "geeksfortest"};
        String s="geeips";
        ArrayList<ArrayList<String>> l= displayContacts(arr.length,arr,s);
        System.out.println(l);
    }
}