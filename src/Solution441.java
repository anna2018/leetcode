
public class Solution441 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(arrangeCoins(2147483647));
	}
	public static int arrangeCoins(int n) {
		if(n<=0){
			return 0;
		}
		int sum=0;
		int i=0;
        for (i = 1; sum <= n - i; i++) {  
            sum += i;  
        }  
		return i-1;
        
    }

}
