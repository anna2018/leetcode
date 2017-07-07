
public class Solution397 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(integerReplacement(2147483647));
	}
	public static int integerReplacement(int n) {
		int count=0;
		int count2=0;
		int temp=n;
		if(n==1){
			return 0;
		}
		if(n%2==0){
			return 1+integerReplacement(n/2);
		}
        else {
        	long t=n;
            return 2 + Math.min(integerReplacement((int)((t + 1) / 2)), integerReplacement((int)((t - 1) / 2)));
        }
    }

}
