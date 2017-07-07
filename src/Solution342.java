
public class Solution342 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPowerOfThree(1));
	}
	public static boolean isPowerOfThree(int num) {
		if(num>0){
			if(num==1)
				return true;
			while(num%4==0){
				num=num/4;
				if(num==1)
					return true;
			}
		}
        return false;
    }
}
