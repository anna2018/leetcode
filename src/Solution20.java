import java.util.Stack;

public class Solution20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isValid("("));
	}
	public static boolean isValid(String s) {
        char[] temp=s.toCharArray();
        int len=temp.length;
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<len;i++){
        	if(temp[i]=='('||temp[i]=='{'||temp[i]=='['){
        		stack.push(temp[i]);
        	}
        	if(temp[i]==')'){
        		if(!stack.empty()&&stack.pop()=='('){
        			continue;
        		}else{
        			return false;
        		}
        	}
        	if(temp[i]=='}'){
        		if(!stack.empty()&&stack.pop()=='{'){
        			continue;
        		}else{
        			return false;
        		}
        	}
        	if(temp[i]==']'){
        		if(!stack.empty()&&stack.pop()=='['){
        			continue;
        		}else{
        			return false;
        		}
        	}
        }
        if(stack.empty())
        	return true;
        else
        	return false;
    }
}
