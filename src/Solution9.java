
public class Solution9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(1));
	}
	public static boolean isPalindrome(int x) {
		if(x==Integer.MAX_VALUE){
			return false;
		}
		int initial=x;
		int flag=1;
		if(x<0){
			flag=-1;
			return false;
		}
		x=Math.abs(x);
		int result=0;
		while(x > 0) {
			if(result > Integer.MAX_VALUE/10) return false;
			result = result*10+x%10;
			x /= 10;
		}
		result=result*flag;
		if(initial==result){
			return true;
		}else{
			return false;
		}
    }
}
