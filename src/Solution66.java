
public class Solution66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] digits={1,9};
		int[] result=plusOne(digits);
		for(int i=0;i<result.length;i++){
			System.out.print(result[i]);
		}
	}
	public static int[] plusOne(int[] digits) {
		int length=digits.length;
        int index=1;
        int i=length-1;
        while(index>0&&i>=0){
        	int temp=digits[i]+index;
        	digits[i]=temp%10;
        	index=temp/10;
        	i--;
        }
        if(i<0&&index>0){
        	int[] result = new int[digits.length + 1];
            System.arraycopy(digits, 0, result, 1, digits.length);
            result[0] = index;
            return result;
        } else {
            return digits;
        }
    }
}
