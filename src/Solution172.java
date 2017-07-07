

public class Solution172 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(trailingZeroes(5));
	}
	public static int trailingZeroes(int n) {
		int result=0;
		while(n>=5){
			n=n/5;
			result=result+n;		
		}
        return result;
    }
}
