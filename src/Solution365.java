
public class Solution365 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(canMeasureWater(3,5,4));
	}
	public static boolean canMeasureWater(int x, int y, int z) {
		return z == 0 || (x + y >= z && z % gcd(x, y) == 0);
    }
	public static int gcd(int x, int y) {
        return y == 0 ? x : gcd(y, x % y);
    }
}
