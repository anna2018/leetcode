import java.util.LinkedList;
import java.util.Queue;

public class Solution3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLongestSubstring("cs"));
	}
	public static int lengthOfLongestSubstring(String s) {
		if(s==null||s.equals("")){
			return 0;
		}
		int count=Integer.MIN_VALUE;
        Queue<Character> queue=new LinkedList<Character>();
        for(int i=0;i<s.length();i++){
        	if(queue.isEmpty()){
        		queue.add(s.charAt(i));
        	}
        	else{
        		if(queue.contains(s.charAt(i))){
        			count=queue.size()>count?queue.size():count;
        			char c=queue.poll();
        			while(c!=s.charAt(i)){
        				c=queue.poll();
        			}
        		}
        		queue.add(s.charAt(i));
        	}
        }
        return count>queue.size()?count:queue.size();
    }

}
