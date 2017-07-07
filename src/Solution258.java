
public class Solution258 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addDigits(34) );
	}
	public static int addDigits(int num) {
        int result=0;
        if(num<10){
        	return num;
        }
        else {
        	while(num/10!=0){
        		result+=num%10;
        		num=num/10;
        	}
        	result+=num;
        	return addDigits(result);
        }
    }

}
