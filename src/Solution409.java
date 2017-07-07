import java.util.HashMap;

public class Solution409 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestPalindrome("abccccdd"));
	}
	public static int longestPalindrome(String s) {
		int count=0;
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++){
			if(!map.containsKey(s.charAt(i))){
				map.put(s.charAt(i), 1);
			}
			else{
				map.remove(s.charAt(i));
				count+=2;
			}
		}
		if(count<s.length()){
			count+=1;
		}
		return count;
    }

}
