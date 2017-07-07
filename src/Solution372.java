import java.math.BigInteger;

public class Solution372 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2147483647;
		int[] b={2,0,0};
		System.out.println(superPow(a,b));
	}
	public static int superPow2(int a, int[] b) {//³¬Ê±
        if(a==0||a==1||b.length==0){
        	return 1;
        }
        double result=0;
        for(int i=0;i<b.length;i++){
        	result=result*10+b[i];
        }
        BigInteger temp=BigInteger.valueOf((long) a);
        BigInteger temp2=BigInteger.valueOf((long) 1337);
        BigInteger temp3=temp.pow((int) result);
        return (temp3.mod(temp2)).intValue();
    }
	private static int pow(int a, int b, int mod)  
    {  
        int ret = 1;  
        int x = a % mod;  
        while (b != 0) {  
            if ((b & 1) == 1) {  
                ret = ret * x % mod;  
            }  
  
            x = x * x % mod;  
  
            b >>= 1;  
        }  
  
        return ret;  
    }  
  
    public static int superPow(int a, int[] b)  
    {  
        int ans = 1;  
        int mod = 1337;  
  
        for (int i = 0; i < b.length; i++) {  
            ans = pow(ans, 10, mod) * pow(a, b[i], mod) % mod;  
        }  
  
        return ans;  
    }  

}
