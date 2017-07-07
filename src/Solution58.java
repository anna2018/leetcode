
public class Solution58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=" ";
		System.out.println(lengthOfLastWord(str));
	}
	public static int lengthOfLastWord(String s) {
        int length=0;
        String[] seq=s.split(" ");
        if(seq.length!=0&&seq[seq.length-1]!=null){
        	length=seq[seq.length-1].length();
        }
        return length;
    }

}
