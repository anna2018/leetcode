
public class Solution459 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(repeatedSubstringPattern("abcabcabc"));
	}
	public static boolean repeatedSubstringPattern(String str) {  
        if(str.length() < 2) 
        	return false;  
        int i = 1;  
        boolean flag = false;  
        while(i<=str.length()/2){  
            if(str.length() % i ==0){  
                flag = check(str,i);  
            }  
            i++;  
            if(flag) break;  
        }  
        return flag;  
    }  
  
  
    public static boolean check(String str,int d){  
        for(int i = d; i < str.length(); i+= d){  
            for(int j = 0; j < d;j ++)  
                if(str.charAt(i + j) != str.charAt(j)) 
                	return false;;  
        }  
        return true;  
    }

}
