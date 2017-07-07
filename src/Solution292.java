
public class Solution292 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean canWinNim(int n) {
        //当n % 4 != 0时，先手必胜；否则先手必负。
		if(n%4!=0){
			return true;
		}
		else{
			return false;
		}
    }
	

}
