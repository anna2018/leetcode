
public class Solution263 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isUgly(-2147483648));
	}
	public static boolean isUgly(int num) {
		if(num<=0){
			return false;
		}
		if(num==1){
			return true;
		}
		if(num%2==0||num%3==0||num%5==0){
			while(num%2==0){
				num=num/2;
			}
			while(num%3==0){
				num=num/3;
			}
			while(num%5==0){
				num=num/5;
			}
			if(num!=1){
				return false;
			}
			else{
				return true;
			}
		}
		else{
			return false;
		}
    }
}
