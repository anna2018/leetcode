import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Solution127 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> wordList=new HashSet<String>();
		wordList.add("hot");
		wordList.add("dot");
		wordList.add("dog");
		wordList.add("lot");
		wordList.add("log");
		System.out.println(ladderLength("hit","hot",wordList));
	}
	public static int ladderLength(String beginWord, String endWord, Set<String> wordList) {
        if(beginWord==null||endWord==null||beginWord.equals(endWord)||beginWord.length()!=endWord.length()){
        	return 0;
        }
        Queue<String> queue=new LinkedList<String>();  
        HashMap<String,Integer> dist=new HashMap<String,Integer>();   
        queue.add(beginWord);  
        dist.put(beginWord, 1);  
        while(!queue.isEmpty())  
        {  
            String head=queue.poll();    
            int headDist=dist.get(head);  
            //从每一个位置开始替换成a~z  
            for(int i=0;i<head.length();i++)  
            {  
                for(char j='a';j<'z';j++)  
                {  
                    if(head.charAt(i)==j) 
                    	continue;  
                    StringBuilder sb=new StringBuilder(head);  
                    sb.setCharAt(i, j);   
                    if(sb.toString().equals(endWord)) 
                    	return headDist+1;   
                    if(wordList.contains(sb.toString())&&!dist.containsKey(sb.toString()))  
                    {  
                        queue.add(sb.toString());  
                        dist.put(sb.toString(), headDist+1);  
                    }  
                }  
            }  
        }   
        return 0;  
    }

}
