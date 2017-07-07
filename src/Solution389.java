import java.util.HashMap;

public class Solution389 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findTheDifference("abcd","abecd"));
	}
	public static char findTheDifference(String s, String t) {
		s=s+t;
		int difference=0;
		char[] str1=s.toCharArray();
		int i=0;
		while(i<str1.length){
			difference=difference^str1[i];
			i++;
		}
        return (char) difference;
    }
}
