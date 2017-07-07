
public class Solution63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] obstacleGrid={{0,0,0},{0,1,0},{0,0,0}};
		System.out.println(uniquePathsWithObstacles(obstacleGrid));
	}
	public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
		int row=obstacleGrid.length;
		int col=obstacleGrid[0].length;
		int[] step = new int[col];  
        step[0] = 1;  
        //dp[i]][j] = dp[i-1][j]+dp[i][j-1] if obstacle[i][j] == 0
        //dp[i]][j] = 0 if obstacle[i][j] == 1
        for(int i=0;i<row;i++){  
            for(int j=0;j<col;j++){  
                if(obstacleGrid[i][j]==1)  
                    step[j] = 0;  
                else if(j>0){  
                    step[j] = step[j-1]+step[j];  
                }  
            }  
        }  
        return step[col-1];  
    }
}
