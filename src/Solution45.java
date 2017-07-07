
public class Solution45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseVowels("leetcode"));
	}
	public static String reverseVowels(String s) {
		if(s==null||s.length()==0){
			return s;
		}
        char[] str=s.toCharArray();
        int left=0,right=str.length-1;
        while(left<right){
        	while(!isVowels(str[left])&&left<right){
        		left++;
        	}
        	while(!isVowels(str[right])&&left<right){
        		right--;
        	}
        	char temp=str[left];
        	str[left]=str[right];
        	str[right]=temp;
        	left++;
    		right--;
        }
        return  String.valueOf(str);
    }
	public String reverseVowels2(String s) {
        if(s==null||s.length()==0){
			return s;
		}
        char[] str=s.toCharArray();
        int left=0,right=str.length-1;
        while(left<right){
        	if(isVowels(str[left])&&isVowels(str[right])){
        		char temp=str[left];
        		str[left]=str[right];
        		str[right]=temp;
        		left++;
        		right--;
        	}else if(isVowels(str[left])&&!isVowels(str[right])){
        		right--;
        	}
        	else if(!isVowels(str[left])&&isVowels(str[right])){
        		left++;
        	}else{
        		left++;
        		right--;
        	}
        }
        return new String(str);
    }
	public static boolean isVowels(char c){
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
			return true;
		}
		else{
			return false;
		}
	}
}
