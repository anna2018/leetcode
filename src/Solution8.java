
public class Solution8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=myAtoi("   b11228552307");
		System.out.println(n);
	}
	public static int myAtoi(String str) {
		if(str==null||str.length()<1){
			return 0;
		}
		str=str.trim();
		double result=0;
		int flag=1;
		if(str.charAt(0)=='+'){
			flag=1;
		}
		else if(str.charAt(0)=='-'){
			flag=-1;
		}else if(str.charAt(0)>='0'&&str.charAt(0)<='9'){
			result=str.charAt(0)-'0';
		}else{
			return 0;
		}
		int i=1;
		while(str.length()>i&&str.charAt(i)>='0'&&str.charAt(i)<='9'){
			result=result*10+str.charAt(i)-'0';
			i++;
		}
		result=result*flag;
		if(result>Integer.MAX_VALUE){
			return Integer.MAX_VALUE;
		}
		if(result<Integer.MIN_VALUE){
			return Integer.MIN_VALUE;
		}
		return (int)result;
        
    }
}
