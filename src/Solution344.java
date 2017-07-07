import java.util.Stack;

public class Solution344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseString2("123"));
	}
	public static String reverseString(String s) {
        StringBuffer str=new StringBuffer(s);
        str.reverse();
        return str.toString();
    }
	public static String reverseString2(String s) {
        Stack<Character> stack=new Stack<Character>();
        char[] str=s.toCharArray();
        for(int i=0;i<str.length;i++){
        	stack.push(str[i]);
        }
        String result="";
        while(!stack.isEmpty()){
        	result+=stack.pop();
        }
        return result;
    }
}
