
public class Solution48 {
	public static void main(String[] args){
		int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
		rotate(matrix);
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void rotate(int[][] matrix) {
		int n = matrix.length;
        int[][] m = new int[n][n];
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                m[row][col] = matrix[n-1-col][row];
            }
        }
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                matrix[row][col] = m[row][col];
            }
        }
    }
}
