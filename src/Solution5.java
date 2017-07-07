
public class Solution5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestPalindrome("a"));
	}
	public static String longestPalindrome(String s) {
		if(s==null){
			return null;
		}
		if(s.equals("")){
			return "";
		}
        String result=s.substring(0,1);
        char[] str=s.toCharArray();
        for(int i=0;i<str.length-1;i++){
        	String p=expandString(s, i);
        	result=result.length()>p.length()?result:p;
        }
        return result;
    }
	public static String expandString(String s,int mid){
		int left=mid,right=mid;
		while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
			left--;
			right++;
		}
		String p1=s.substring(left+1,right);
		left=mid;
		right=mid+1;
		while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
			left--;
			right++;
		}
		String p2=s.substring(left+1,right);
		return p1.length()>p2.length()?p1:p2;
	}

}
