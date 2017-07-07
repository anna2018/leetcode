import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Solution205 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isIsomorphic("foo","bar"));
	}
	public static boolean isIsomorphic(String s, String t) {
		if(s==null||t==null){
			return false;
		}
        if(s.equals(t)){
        	return true;
        }else{
        	if(s.length()!=t.length()){
        		return false;
        	}
        	Map<Character,Character> hashmap1=new HashMap<Character,Character>();
        	Set<Character> set =new HashSet<Character>();
        	for(int i=0;i<s.length();i++){
        		if(hashmap1.containsKey(s.charAt(i))&&(hashmap1.get(s.charAt(i))!=t.charAt(i))){
        			return false;
        		}
        		else{
        			if(set.contains(t.charAt(i))&&!hashmap1.containsKey(s.charAt(i))){
        				return false;
        			}
        			else{
        				hashmap1.put(s.charAt(i), t.charAt(i));
        				set.add(t.charAt(i));
        			}
        		}
        		
        	}
        }
        return true;
    }

}
