import java.util.Stack;

public class Solution331 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isValidSerialization("1,#"));
	}
	public static boolean isValidSerialization(String preorder) {
		int n = preorder.length();  
        int i = 0;  
        int m = 1;  
  
        while (i < n && m > 0)  
        {  
            while (i < n && preorder.charAt(i) != ',')  
            {  
                i++;  
            }  
  
            if (preorder.charAt(i-1) == '#')  
            {  
                m--;  
            }  
            else  
            {  
                m++;  
            }  
            if (i < n)  
            {  
                i++;  
            }  
        }  
  
        if (i != n || m != 0)  
        {  
            return false;  
        }  
        return true;  
    }

}
