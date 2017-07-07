import java.util.HashSet;

public class Solution36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str={".87654321","2........","3........","4........","5........","6........","7........","8........","9........"};
		char[][] c= new char[9][9];
		for(int i=0;i<9;i++){
			c[i]=str[i].toCharArray();
		}
		System.out.println(isValidSudoku(c));
	}
	public static boolean isValidSudoku(char[][] board) {
		HashSet<Character> set=new HashSet<Character>();
		//检查每一行
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				if(board[i][j]=='.'){
					continue;
				}
				if(set.contains(board[i][j])){
					return false;
				}else{
					set.add(board[i][j]);
				}
			}
			set.clear();
		}
		for(int j=0;j<9;j++){
			for(int i=0;i<9;i++){
				if(board[i][j]=='.'){
					continue;
				}
				if(set.contains(board[i][j])){
					return false;
				}else{
					set.add(board[i][j]);
				}
			}
			set.clear();
		}
		// 检查单个小方格
		for (int k = 0; k < 9; k++) {
		      for (int i = (k/3)*3; i < (k/3)*3+3; i++) {
		         for (int j = (k%3)*3; j < (k%3)*3+3; j++) {
		            if (board[i][j] == '.')
		                 continue;
	                if (set.contains(board[i][j])){
		                return false;
	                }
	                else{
	                	set.add(board[i][j]);
	                }
		         }
		      }
	          set.clear();
		}
        return true;
    }
}
