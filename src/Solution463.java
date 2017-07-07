
public class Solution463 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid={{0,1,0,0},
		 {1,1,1,0},
		 {0,1,0,0},
		 {1,1,0,0}};
		System.out.println(islandPerimeter(grid));
	}
	public static int islandPerimeter(int[][] grid) {
		int count=0;
		for(int i=0;i<grid.length;i++){
			for(int j=0;j<grid[0].length;j++){
				if (grid[i][j] == 0) 
					continue;  
                if (i == 0 || grid[i - 1][j] == 0) 
                	count++;  
                if (i == grid.length - 1 || grid[i + 1][j] == 0) 
                	count++;  
                if (j == 0 || grid[i][j - 1] == 0) 
                	count++;  
                if (j == grid[i].length - 1 || grid[i][j + 1] == 0) 
                	count++;
			}
		}
        return count;
    }
	
}
