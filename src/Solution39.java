import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candidates = {2,3,6,7};
		int target = 7;
		List<List<Integer>> list = combinationSum(candidates, target);
		for (List<Integer> l : list) {
			for (int e : l) {
				System.out.print(e + "\t");
			}
			System.out.println();
		}
	}

	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		List<Integer> temp = new ArrayList<Integer>();
		if (candidates == null || candidates.length == 0) {
			return list;
		}
		Arrays.sort(candidates);
//		int i = 0, j = 0;
//		int sum = 0;
//		
//		while (i < candidates.length && j < candidates.length - 1) {
//			sum += candidates[i];
//			temp.add(candidates[i]);
//			if (sum >= target) {
//				j++;
//				if (sum == target) {
//					list.add(temp);
//				}
//				temp = new ArrayList<Integer>();
//				sum = 0;
//				i = j;
//			}
//			i++;
//		}
		helper(candidates, target, 0, temp, list);
		return list;
	}

	private static void helper(int[] candidates, int target, int start, List<Integer> temp,
			List<List<Integer>> list) {
		if (target < 0)
			return;
		if (target == 0) {
			list.add(new ArrayList<Integer>(temp));
			return;
		}

		for (int i = start; i < candidates.length; i++) {
			if (i > 0 && candidates[i] == candidates[i - 1])// deal with
															// dupicate
				continue;
			temp.add(candidates[i]);
			int newtarget = target - candidates[i];
			helper(candidates, newtarget, i, temp, list);// 之所以不传i+1的原因是：
														// The same repeated
														// number may be
														// chosen from C
														// unlimited number of
														// times.
			temp.remove(temp.size() - 1);
		}
	}
}
