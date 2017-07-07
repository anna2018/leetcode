import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<String> generateParenthesis(int n) {
		List<String> list=new ArrayList<String>();
		if(n<=0){
			return list;
		}
		String item = new String();
		dfs(list,item,n,n);  
		return list;
    }
	public void dfs(List<String> res, String item, int left, int right){ 
        if(left > right)
            return;
            
        if (left == 0 && right == 0){  
            res.add(new String(item));  
            return;  
        }
        
        if (left>0) 
            dfs(res,item+'(',left-1,right);  
        if (right>0) 
            dfs(res,item+')',left,right-1);  
    }
}
