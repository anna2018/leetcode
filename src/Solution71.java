import java.util.Stack;

public class Solution71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(simplifyPath("/.."));
	}
	public static String simplifyPath(String path) {
		if(path==null) 
			return null;
        String[] array=path.split("/");
        Stack<String> stack = new Stack<String>();  
        
        for( int i=0; i<array.length; i++) {  
            String s = array[i];  
            if( s.equals(".") || s.length()==0) {//!alert: s.length==0 or u will have many ////.  
                 continue;  
            } else if(s.equals("..") ) {  
                if(!stack.isEmpty()){  
                    stack.pop();  
                }  
            } else {  
                stack.push(s);  
            }   
        }  
          
        StringBuilder sb = new StringBuilder();  
          
        while(!stack.isEmpty()) {  
            sb.insert(0, stack.pop() );  
            sb.insert(0, "/");  
        }  
          
        if(sb.length()==0) 
        	sb.insert(0, "/");  
        return sb.toString();  
    }
}
