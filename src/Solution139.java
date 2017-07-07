import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution139 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "leetcode";
		Set<String> dict = new HashSet<String>();
		dict.add("leet");
		dict.add("code");
		System.out.println(wordBreak(s, dict));
	}

	public static boolean wordBreak(String s, Set<String> wordDict) {
		if (s == null || s.length() == 0 || wordDict.isEmpty()) {
			return false;
		}
		int len = s.length();
		boolean[] arrays = new boolean[len + 1];
		arrays[0] = true;
		for (int i = 1; i <= len; ++i) {
			for (int j = 0; j < i; ++j) {
				if (arrays[j] && wordDict.contains(s.substring(j, i))) {
					arrays[i] = true;
					break;
				}
			}
		}
		return arrays[len];
	}

	public static boolean wordBreak2(String s, Set<String> wordDict) {
		boolean flag = false;
		int strLen = s.length();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = strLen - 1; i >= 0; --i) {
			String endSubStr = s.substring(i);
			if (wordDict.contains(endSubStr)) {
				list.add(i);
			} else {
				for (Integer n : list) {
					if (wordDict.contains(s.substring(i, n))) {
						list.add(i);
						break;
					}
				}
			}
		}
		if (list.isEmpty()) {
			flag = false;
		} else {
			Integer n = list.get(list.size() - 1);
			flag = n == 0 ? true : false;
		}
		return flag;
	}
}
