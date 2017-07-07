
public class Solution191 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hammingWeight(11));
	}
	public static int hammingWeight(int n) {
        int result=0;
        String str=Integer.toBinaryString(n);
        for(int i=0;i<str.length();i++){
        	if(str.charAt(i)=='1'){
        		result++;
        	}
        }
        return result;
    }

}
