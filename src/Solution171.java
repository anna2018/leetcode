
public class Solution171 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(titleToNumber("A"));
	}
	public static int titleToNumber(String s) {
        int result=0;
        if(s==null||s==""){
        	return 0;
        }
        char[] c=s.toCharArray();
        for(int i=0;i<c.length;i++){
        	result+=(c[i]-'A'+1)*Math.pow(26, c.length-i-1);
        }
        return result;
    }

}
