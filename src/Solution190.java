import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class Solution190 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseBits(43261596));
	}
	public static int reverseBits(int n) {
		int count = 32;
        int result = 0;
        while(count > 0) {
        	int last = n&1;
        	n = n>>1;
        	result = (result<<1)+last;
        	count--;
        }
        return result;
    }
}
