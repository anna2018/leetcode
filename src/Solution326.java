
public class Solution326 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPowerOfThree(0));
	}
	public static boolean isPowerOfThree(int n) {
		if(n>0){
			if(n==1)
				return true;
			while(n%3==0){
				n=n/3;
				if(n==1)
					return true;
			}
		}
        return false;
    }
}
