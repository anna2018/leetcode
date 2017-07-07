
public class Solution393 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data={235,140,4};
		System.out.println(validUtf8(data));
	}
	public static boolean validUtf8(int[] data) {
		int n=data.length;
        int check = 0;
        for (int i = 0; i < n; i++) {
            if (check > 0) {
                if ((data[i] & 0b10000000) == 0b10000000) 
                    check--;
                else 
                    return false;
            } else {
                check = getHeadType(data[i]);
                if (check < 0) 
                	return false;
            }
        }
        return check == 0;
    }
	public static int getHeadType(int num) {
        if ((num & 0b11110000) == 0b11110000) return 3;
        if ((num & 0b11100000) == 0b11100000) return 2;
        if ((num & 0b11000000) == 0b11000000) return 1;
        if ((num & 0b10000000) == 0b10000000) return -1; //Æ¥Åä³ö´í
        return 0;
    }

}
