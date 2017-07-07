import java.util.LinkedList;
import java.util.Queue;
class Pair{
	int x;
	int y;
	Pair(int i,int j){
		x=i;
		y=j;
	}
};
public class Solution130 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] c={{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};
		solve(c);
		for(int i=0;i<c.length;i++){
			for(int j=0;j<c[0].length;j++){
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void solve(char[][] board) {
		if(board==null||board.length==0) {  
            return;  
        }
		Queue queue = new LinkedList<Pair>(); 
		//对所有在边上的O节点进行BFS
        for(int i=0;i<board.length;i++){
        	for(int j=0;j<board[0].length;j++){
        		if(i==0||i==(board.length-1)||j==0||j==(board[0].length-1)) {  
                    if(board[i][j]=='O') {  
                        Pair position = new Pair(i,j);  
                        queue.add(position);  
                    }  
                }
        	}
        }
        //向上搜索
        int x1,y1;  
        //BFS  
        while(!queue.isEmpty()) {  
            Pair position = (Pair)queue.poll();  
            x1 = position.x;  
            y1 = position.y;  
  
            if(board[x1][y1]=='Y') {  
                continue;  
            }  
            //四个方向查找，找到为'O'的节点放入队列中。  
            //向左搜素  
            board[x1][y1] = 'Y';  
            int index = x1 - 1;  
            if(index>=0&&board[index][y1]=='O') {  
                queue.add(new Pair(index,y1));  
            }  
            //向右搜索  
            index = x1 + 1;  
            if(index<board.length&&board[index][y1]=='O') {  
                queue.add(new Pair(index,y1));  
            }  
            //向上搜索  
            index = y1 + 1 ;  
            if(index<board[0].length&&board[x1][index]=='O') {  
                queue.add(new Pair(x1,index));  
            }  
            //向下搜索  
            index = y1 - 1;  
            if(index>=0&&board[x1][index]=='O') {  
                queue.add(new Pair(x1,index));  
            }  
        }
        for(int i=0;i<board.length;i++){
        	for(int j=0;j<board[0].length;j++){
                    if(board[i][j]=='Y') {  
                    	board[i][j]= 'O';  
                    }  
                    else {  
                        if(board[i][j]=='O') {  
                            board[i][j] = 'X';  
                        }  
                    }  
        	}
        }
        return;
    }

}
