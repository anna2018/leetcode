import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution140 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "catsanddog";
		Set<String> dict = new HashSet<String>();
		dict.add("cat");
		dict.add("cats");
		dict.add("and");
		dict.add("sand");
		dict.add("dog");
		List<String> list=wordBreak(s, dict);
		for(String str:list){
			System.out.print(str+",");
		}
	}

	public static List<String> wordBreak2(String s, Set<String> wordDict) {
		List<String> list=new ArrayList<String>();
		if (s == null || s.length() == 0 || wordDict.isEmpty()) {
			return list;
		}
		int len = s.length();
		boolean[] arrays = new boolean[len + 1];
		arrays[0] = true;
		String str="";
		for (int i = 1; i <= len; ++i) {
			for (int j = 0; j < i; ++j) {
				if (arrays[j] && wordDict.contains(s.substring(j, i))) {
					arrays[i] = true;
					if(i!=len){
						str+=s.substring(j, i)+" ";
					}
					else{
						str+=s.substring(j, i);
					}
					break;
				}
			}
			list.add(str);
		}
		return list;
	}
	public static List<String> result;
	public static List<String> wordBreak(String s, Set<String> wordDict) {
		int strLen = s.length();
		result=new ArrayList<String>();
		String[] all = wordDict.toArray(new String[0]);
		String str="";
		if (s == null || s.length() == 0 || wordDict.isEmpty()) {
			return result;
		}
		for (int i = 0; i < s.length(); i++) {  
            boolean flag = false;  
            for (int j = 0; j < all.length; j++) {  
                if (all[j].indexOf(s.charAt(i)) > -1) {  
                    flag = true;  
                    break;  
                }  
            }  
            if (!flag) {  
                return result;  
            }   
        }   
        nextWord(0, s, all, "");  
		return result;
	}
	public static void nextWord(int pos, String s, String[] all, String sent) {  
        if (pos == s.length()) {  
            result.add(sent.trim());  
        }   
        for (int i = 0; i < all.length; i++) {  
            if (s.indexOf(all[i], pos) == pos) {  
                String str = sent;  
                str += all[i] + " ";  
                nextWord(pos + all[i].length(), s, all, str);  
            }  
        }  
    }  
}
