
public class Solution400 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findNthDigit(2147483647));
	}
	public static int findNthDigit(int n) {
        if(n<=0){
        	return 0;
        }
        long num=9;
        long count=1;
        int weishu=1;
        while(n>weishu*num){
        	n-=weishu*num;
        	num*=10;
        	count*=10;
        	weishu++;
        }
        count += (n-1)/weishu;  
        return String.valueOf(count).charAt((n-1)%weishu)-'0';  
    }

}
