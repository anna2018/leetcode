import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Solution447 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] points = { { 0, 0 }, { 1, 0 }, { 2, 0 } };
		System.out.println(numberOfBoomerangs(points));
	}

	public static int numberOfBoomerangs(int[][] points) {
		if (points.length < 3) {
			return 0;
		}
		int result = 0;
		for (int i = 0; i < points.length; i++) {
			Map<Integer, Integer> hash = new HashMap<Integer, Integer>();
			for (int j = 0; j < points.length; j++) {
				if (i == j) {
					continue;
				} else {
					int dist = distance(points[i], points[j]);
					hash.put(dist, hash.getOrDefault(dist, 0) + 1);
				}
			}
			for (Integer val : hash.values()) {
				result += val * (val - 1);
			}
		}
		return result;

	}

	public static int distance(int[] a, int[] b) {
		return (a[0] - b[0]) * (a[0] - b[0]) + (a[1] - b[1]) * (a[1] - b[1]);
	}
}
