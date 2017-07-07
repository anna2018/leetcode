
public class Solution6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="P";
		String str=convert(s, 1);
		System.out.println(str);
		
	}

	public static String convert(String s, int numRows) {
		if(numRows<=1)
			return s;
		String strConvert = "";
		int numCols=(int)Math.ceil(((double)s.length()/(2*numRows-2)))*numRows;
		char[][] c = new char[numRows][numCols];
		int i = 0;
		int j = 0;
		int index=0;
		while (i == 0&&index<s.length()) {
			for (; i < numRows&&index<s.length(); i++,index++) {
				c[i][j] = s.charAt(index);
			}
			i = i - 2;
			j = j + 1;
			for (; i > 0&&index<s.length(); i--, j++,index++) {
				c[i][j] = s.charAt(index);
			}
		}
		for(int m=0;m<numRows;m++){
			for(int n=0;n<j;n++){
				if(c[m][n]!=0){
					strConvert+=c[m][n];
				}
			}
		}
		return strConvert;
	}
}
