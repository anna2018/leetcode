
public class Solution62 {
	public static void main(String args[]){
		System.out.println(uniquePaths(3,7));
	}
	public static int uniquePaths1(int m, int n) {//��ʱ
		if(m==1){
			return 1;
		}
		if(n==1){
			return 1;
		}
		else{
			return uniquePaths(m-1,n)+uniquePaths(m,n-1);
		}
    }
	public static int uniquePaths(int m, int n) {//
		int[][] result = new int[m][n];

        // ��һ�еĽ�
        for (int i = 0; i < m; i++) {
            result[i][0] = 1;
        }

        // ��һ�еĽ�    
        for (int i = 1; i < n; i++) {
            result[0][i] = 1;
        }

        // ����λ�õĽ�
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                result[i][j] = result[i - 1][j] + result[i][j - 1];
            }
        }

        // ����Ľ�
        return result[m - 1][n - 1];
    }
}
