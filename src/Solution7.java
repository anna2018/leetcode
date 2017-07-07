
public class Solution7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=reverse(-2147483648);
		System.out.println(n);
	}
	public static int reverse2(int x) {
		int length=(int)Math.log10(Math.abs(x)) + 1;
		if(length==1){
			return x;
		}
		if(x==Integer.MAX_VALUE){
			return 0;
		}
		int num=(int)Math.ceil((double)length/2);
		int n=0;
		for(int i=1;i<=num;i++){
			if(i>1){
				int temp1=(int) (x%(Math.pow(10,i))/(Math.pow(10,i-1))); 
				n+=temp1*(Math.pow(10,length-i));
				System.out.println(temp1);
				if(i!=length-i+1){
					int temp2=(int) (x%(Math.pow(10,length-i))/(Math.pow(10,length-i-1)));
					System.out.println(temp2);
					n+=temp2*(Math.pow(10,i));
				}
			}
			else{
				int temp1=(int) (x%(Math.pow(10,1))); 
				n+=temp1*(Math.pow(10,length-1));
				int temp2=(int) (x/(Math.pow(10,length-1)));
				n+=temp2;
			}
		}
        return n;
    }
	public static int reverse(int x) {
//		int length=(int)Math.log10(Math.abs(x)) + 1;
//		if(length==1){
//			return x;
//		}
		if(x==Integer.MAX_VALUE){
			return 0;
		}
		int flag=1;
		if(x<0){
			flag=-1;
		}
		x=Math.abs(x);
		int result=0;
		while(x > 0) {
			if(result > Integer.MAX_VALUE/10) return 0;
			result = result*10+x%10;
			x /= 10;
		}
		return result*flag;
	}
}
