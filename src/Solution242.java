
public class Solution242 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isAnagram("rat","car"));
	}
	public static boolean isAnagram(String s, String t) {
		if(s.equals(t)){
			return true;
		}
		if(s==null||t==null||s.length()!=t.length()){
			return false;
		}
		s=s.toLowerCase();
		t=t.toLowerCase();
		int[] num=new int[26];
		for(int i=0;i<s.length();i++){
			num[s.charAt(i)-'a']++;
			num[t.charAt(i)-'a']--;
		}
		for(int i=0;i<26;i++){
			if(num[i]!=0){
				return false;
			}
		}
        return true;
    }

}
