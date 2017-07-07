
public class Solution12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(intToRoman(1234));
	}
	public static String intToRoman(int num) {
        int[] aArray = {1000,900,500,400,100,90,50,40,10,9,5,4,1};  
        String[] rArray = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};  
        String rNumber = "";  
        for(int i=0; i<aArray.length; i++){  
            while(num >= aArray[i]){  
                rNumber += rArray[i];  
                num -= aArray[i];  
            }  
        }  
        return rNumber;  
    }
}
