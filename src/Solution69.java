
public class Solution69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mySqrt(64));
	}
	public static int mySqrt(int x) {
		if(x<=1) {  
            return x;  
        }
		int begin = 1;  
        int end   = x;  
        int middle = 0;  
        while(begin<=end) {  
            middle = begin + (end - begin)/2;  
            //��Ҫд��middle*middle==x�������  
            if(middle==x/middle) {  
                return middle;  
            } else {  
                if (middle<x/middle) {  
                    begin = middle + 1;  
                } else {  
                    end = middle - 1;  
                }  
            }   
        }   
        //��������endһ��<begin�����Է���end  
        return end;
    }
}
