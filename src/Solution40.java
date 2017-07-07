import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candidates = {10, 1, 2, 7, 6, 1, 5};
		int target = 8;
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
		helper(candidates, target, 0, temp, list);
		return list;
	}

	private static void helper(int[] candidates, int target, int start, List<Integer> temp,
			List<List<Integer>> list) {
		if (target < 0)
			return;
		if (target == 0) {
			if(!list.contains(temp)){
				list.add(new ArrayList<Integer>(temp));
			}
			return;
		}

		for (int i = start; i < candidates.length; i++) {
			temp.add(candidates[i]);
			int newtarget = target - candidates[i];
			helper(candidates, newtarget, i+1, temp, list);
			temp.remove(temp.size() - 1);
		}
	}
}
