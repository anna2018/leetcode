import java.util.ArrayList;
import java.util.List;

public class Solution401 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static List<String> readBinaryWatch(int num) {
        List list=new ArrayList();
        if(num<0){
        	return list;
        }
        for(int h=0; h<12; h++){  
            for(int m=0; m<60; m++){  
                if(Integer.bitCount(h) + Integer.bitCount(m) == num){  
                    list.add(String.format("%d:%02d",h,m));  
                }  
            }  
        }  
        return list;
    }
}
