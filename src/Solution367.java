
public class Solution367 {
	public static void main(String args[]){
		System.out.println(isPerfectSquare(12));
	}
	public static boolean isPerfectSquare(int num) {
        if(num<=0){
        	return false;
        }
        long left = 1, right = num;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            if (mid * mid == num) {
                return true;
            } else if (mid * mid < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
