
public class Soultion67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addBinary("0","0"));
	}

	public static String addBinary(String a, String b) {
		while(a.length()!=b.length()){
			if(a.length()>b.length()){
				b="0"+b;
			}
			else if(a.length()<b.length()){
				a="0"+a;
			}
		}
		int sum=0;
		int a1=0;
		int b1=0;
		int index=0;//½øÎ»
		StringBuffer result=new StringBuffer();
		for(int i=a.length()-1;i>=0;i--){
			a1=a.charAt(i)-'0';
			b1=b.charAt(i)-'0';
			sum=a1+b1+index;
			if(sum>=2){
				index=1;
				result.append((char)(sum-2+'0'));
			}else{
				index=0;
				result.append((char)(sum+'0'));
			}
		}
		if(index==1){
			result.append("1");
		}
        return result.reverse().toString();
    }

}
