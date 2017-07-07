
public class Solution415 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num1="6913259244";
		String num2="71103343";
		System.out.println(addStrings(num1,num2));
	}
	public static String addStrings(String num1, String num2) {
        String result="";
        int i=num1.length()-1;
        int j=num2.length()-1;
        int array=0;//½øÎ»
        while(i>=0&&j>=0){
        	int res=(num1.charAt(i)-'0')+(num1.charAt(j)-'0')+array;
        	if(res>=10){
        		result=(res-10)+result;
        		array=1;
        	}
        	else{
        		result=res+result;
        		array=0;
        	}
        	j--;
        	i--;
        }
        if(i!=-1){
        	while(i>=0){
        		int res=(num1.charAt(i)-'0')+array;
            	if(res>=10){
            		result=(res-10)+result;
            		array=1;
            	}
            	else{
            		result=res+result;
            		array=0;
            	}
        		i--;
        	}
        }
        if(j!=-1){
        	int res=(num2.charAt(j)-'0')+array;
        	if(res>=10){
        		result=(res-10)+result;
        		array=1;
        	}
        	else{
        		result=res+result;
        		array=0;
        	}
    		j--;
        }
        return result;
    }

}
