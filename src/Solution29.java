
public class Solution29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(divide(-2147483648,-1));
	}
	public static int divide(int dividend, int divisor) {
		long result=0;
		int flag=0;
		if((dividend>0&&divisor<0)||(dividend<0&&divisor>0)){
			flag=1;
		}
		long dividend2=dividend;
		dividend2=Math.abs(dividend2);
		long divisor2=divisor;
		divisor2=Math.abs(divisor2);
		while(dividend2>=divisor2){
			result++;
			dividend2=dividend2-divisor2;
		}
		if(flag==1){
			result=-result;
		}
		if(result>Integer.MAX_VALUE||result<Integer.MIN_VALUE){
			return Integer.MAX_VALUE;
		}
        return (int)result;
    }
}
