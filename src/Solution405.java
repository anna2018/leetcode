import java.util.ArrayList;
import java.util.Collections;

public class Solution405 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(toHex(-1));
	}
	public static String toHex(int num) {
		if(num==0){
			return "0";
		}
        String result="";
        char[] hexChar={'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        while (num!=0) {
            result = hexChar[num & 15] + result;
            num = (num >>> 4);
        }
        return result.isEmpty() ? "0" : result;
//        ArrayList<Character>re = new ArrayList<Character>();
//		int temp = 0;
//		long test=num;
//		long tt=0x100000000l;
//		if(test<0){
//			test =tt +test;
//		}
//		while(test!=0){
//			temp = (int)test%16;
//			test = test/16;
//			if(temp<=9){
//				re.add((char) (temp+'0'));
//			}else{
//				re.add((char) (temp-10+'a'));
//			}
//		}
//		Collections.reverse(re);
//		for(int i=0;i<re.size();i++){
//			result+=re.get(i);
//		}
        
    }
}
