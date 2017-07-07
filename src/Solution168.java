
public class Solution168 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convertToTitle(703));
	}
	public static String convertToTitle(int n) {
        String result="";
        StringBuffer str=new StringBuffer();
        if(n<=0){
        	return null;
        }
        while(n>0){
        	int r=n%26;
        	n=n/26;
        	if(r==0){
        		str.append("Z");
        		n--;
        	}
        	else{
        		str.append((char)(r+'A'-1));
        	}
        }
        result=str.reverse().toString();
//        if(n<=26){
//    		result=result+(char)(n+'A'-1);
//    		return result;
//    	}
//        if(n/26!=0&&n%26!=0){
//        	while(n/26>1)
//        	result=result+(char)(n/26+'A'-1);
//        	result=result+(char)(n%26+'A'-1);
//        	return result;
//        }if(n/26!=0&&n%26==0){
//        	result=result+(char)((n-1)/26+'A'-1);
//        	result=result+(char)('A'+25);
//        	return result;
//        }
        return result;
    }

}
