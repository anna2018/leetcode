import java.util.HashSet;
import java.util.Set;

public class Solution345 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseVowels("hello"));
	}
	 public static String reverseVowels(String s) {
	        Set<Character> set = new HashSet<Character>();
	        set.add('a');
	        set.add('e');
	        set.add('i');
	        set.add('o');
	        set.add('u');
	        set.add('A');
	        set.add('E');
	        set.add('I');
	        set.add('O');
	        set.add('U');
	        char[] c = s.toCharArray();
	    
	        int i = 0, j = s.length() - 1;
	        while (i < j) {
	            while (i < j && !set.contains(c[i])) {
	                i++;
	            }
	            while (i < j && !set.contains(c[j])) {
	                j--;
	            }
	            char tmp = c[i];
	            c[i] = c[j];
	            c[j] = tmp;
	            i++;
	            j--;
	        }
	        return String.valueOf(c);
		}

}
