
public class Solution70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(climbStairs1(1));
	}
	public static int climbStairs1(int n) {//�ݹ��㷨
		if(n<=2)
			return n;
		else{
			return climbStairs(n-1)+climbStairs(n-2);
		}
    }
	public static int climbStairs(int n) {//�ǵݹ��㷨
		int x=0;
		int y=1;
		int sum=0;
		for(int i=0;i<n;i++){
			sum=x+y;
			x=y;
			y=sum;
		}
		return sum;
    }
}
