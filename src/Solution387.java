import java.util.HashMap;

public class Solution387 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(firstUniqChar("loveleetcode"));
	}
	public static int firstUniqChar(String s) {
		char[] str=s.toCharArray();
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<str.length;i++){
			if(map.containsKey(str[i])){
				map.replace(str[i], -1);
			}else{
				map.put(str[i], i);
			}
		}
		for(int i=0;i<str.length;i++){
			if(map.containsKey(str[i])){
				if(map.get(str[i])!=-1){
					return map.get(str[i]);
				}
			}
		}
        return -1;
    }

}
