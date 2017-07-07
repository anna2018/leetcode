
public class Solution79 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board={{'A','B','C','E'},
				{'S','F','C','S'},
				{'A','D','E','E'}};
		String word="ABCB";
		System.out.println(exist(board,word));
	}
	public static boolean exist(char[][] board, String word) {
        if(board==null||board.length==0||board[0].length==0){
        	return false;
        }
        for(int i=0;i<board.length;i++){
        	for(int j=0;j<board[0].length;j++){
        		if(dfs(board,word,i,j,0)){
        			return true;
        		}
        	}
        }
        return false;
    }
	public static boolean dfs(char[][] board, String word,int i,int j,int index){
		if(word.length()<=index){
			return true;
		}
		if(i<0||i>=board.length||j<0||j>=board[0].length){
			return false;
		}
		if(word.charAt(index)!=board[i][j]){
			return false;
		}
		char temp=board[i][j];
		board[i][j]='#';
		boolean result=dfs(board, word,i+1,j,index+1)||dfs(board, word,i-1,j,index+1)||dfs(board, word,i,j+1,index+1)||dfs(board, word,i,j-1,index+1);
		board[i][j]=temp;
		return result;
	}
}
