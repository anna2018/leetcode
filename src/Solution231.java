
public class Solution231 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPowerOfTwo(64));
	}
	public static boolean isPowerOfTwo(int n) {
		long d=Math.round(Math.log(n)/Math.log(2));
        return n>0&&n==Math.pow(2, d);
    }

}
