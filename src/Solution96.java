
public class Solution96 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numTrees(1));
	}
	public static int numTrees(int n) {
		if(n<=0){
			return 0;
		}
		if(n==1){
			return 1;
		}
		if(n==2){
			return 2;
		}
		else{
			int[] record = new int[n + 1];
			record[0] = 1;
			record[1] = 1;
			record[2] = 2;
			for (int i = 3; i <= n; i++) {
				int tmp = 0;
				for (int k = 0; k < i; k++) {
					tmp += (record[k] * record[i - k - 1]);
				}
				record[i] = tmp;
			}
			return record[n];
		}
    }

}
