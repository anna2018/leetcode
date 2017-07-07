import java.util.ArrayList;
import java.util.HashMap;

public class Solution383 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(canConstruct("a", "b"));
	}
	public static boolean canConstruct(String ransomNote, String magazine) {
		if (ransomNote.equals(magazine)) {
            return true;
        }
        if ("".equals(magazine)) {
            return false;
        }
        if ("".equals(ransomNote)) {
            return true;
        }
		char[] str1=ransomNote.toCharArray();
		char[] str2=magazine.toCharArray();
		ArrayList map1=new ArrayList();
		ArrayList map2=new ArrayList();
		int i=0;
		while(i<str1.length&&i<str2.length){
			map1.add(str1[i]);
			map2.add(str2[i]);
			i++;
		}
		while(i<str1.length){
			map1.add(str1[i]);
			i++;
		}
		while(i<str2.length){
			map2.add(str2[i]);
			i++;
		}
		int min=map1.size()>map2.size()?map2.size():map1.size();
		int j=0;
		while(j<min){
			if(map2.contains(map1.get(j))){
				map2.remove(map1.get(j));
				j++;
				continue;
			}else{
				return false;
			}
		}
        return true;
    }

}
