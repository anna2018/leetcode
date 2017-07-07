public class Solution125 {
	public static void main(String[] args){
		System.out.println(isPalindrome2(""));
	}
    public static boolean isPalindrome1(String s) {
        if(s==null){
        	return false;
        }
        if(s==""||s.length()==0){
        	return true;
        }
        String str="";
        for(int i=0;i<s.length();i++){
        	if((s.charAt(i)>='0'&&s.charAt(i)<='9')||(s.charAt(i)>='A'&&s.charAt(i)<='Z')||(s.charAt(i)>='a'&&s.charAt(i)<='z')){
        		str+=s.charAt(i);
        	}
        }
        str=str.toLowerCase();
        for(int i=0;i<str.length()/2;i++){
        	char a =str.charAt(i);
        	char b=str.charAt(str.length()-1-i);
        	if(a==b){
        		continue;
        	}
        	else{
        		return false;
        	}
        }
        return true;
    }
    public static boolean isPalindrome2(String s) {
        if(s==null){
        	return false;
        }
        if(s==""||s.length()==0){
        	return true;
        }
        s=s.toLowerCase();
        int low=0;
        int high=s.length()-1;
        while(low<high){
        	if((s.charAt(low)<'0'||s.charAt(low)>'9')&&(s.charAt(low)<'a'||s.charAt(low)>'z')){
        		low++;
        		continue;
        	}
        	if((s.charAt(high)<'0'||s.charAt(high)>'9')&&(s.charAt(high)<'a'||s.charAt(high)>'z')){
        		high--;
        		continue;
        	}
        	if(s.charAt(low)==s.charAt(high)){
        		low++;
        		high--;
        	}
        	else{
        		return false;
        	}
        }
        return true;
    }
}