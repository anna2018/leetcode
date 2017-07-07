
public class Solution59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		int[][] matrix=generateMatrix(n);
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}
	public static int[][] generateMatrix(int n) {
		int[][] matrix=new int[n][n];
		if(n<=0){
			return matrix;
		}
		int x1 = 0;
		int y1 = 0;
		int x2 = matrix.length - 1;
		int y2 = matrix[0].length - 1;
		int temp=1;
		while (x1 <= x2 && y1 <= y2&&temp<=n*n) {
			for (int i = y1; i <= y2; i++) {// right
				matrix[x1][i]=temp;
				temp++;
			}
			for (int j = x1 + 1; j <= x2; j++) {// down
				matrix[j][y2]=temp;
				temp++;
			}
			if (x1 != x2) {
				for (int i = y2 - 1; i >= y1; i--) {// left
					matrix[x2][i]=temp;
					temp++;
				}
			}
			if (y1 != y2) {// up
				for (int j = x2 - 1; j > x1; j--) {
					matrix[j][y1]=temp;
					temp++;
				}
			}
			x1++;
			y1++;
			x2--;
			y2--;
		}
		return matrix;
    }

}
