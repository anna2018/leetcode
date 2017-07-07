
public class Solution38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countAndSay(2));
	}
	public static String countAndSay(int n) {
		if(n<=0){
			return "";
		}
		if(n==1)
		{
			return "1";
		}
		String result="1";
		StringBuffer ret = new StringBuffer();
		int count=0;   //记录数字出现个数
		int j;
		for(int i=1;i<n;i++){
			count=1;
			ret.setLength(0);
			for(j=1;j<result.length();j++){
				if(result.charAt(j)==result.charAt(j-1)){
					count++;
				}else{
					ret.append(count);
					ret.append(result.charAt(j-1));
					count=1;
				}
			}
			ret.append(count);
			ret.append(result.charAt(j-1));
			result=ret.toString();
		}
        return ret.toString();
    }
}
