import java.util.HashMap;

public class Solution299 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getHint("1122","2211"));
	}
	public static String getHint(String secret, String guess) {
		int bulls=0,cows=0;
        char[] str_secret=secret.toCharArray();
        char[] str_guess=guess.toCharArray();
        HashMap<Character,Integer> map1=new HashMap<Character,Integer>();
        HashMap<Character,Integer> map2=new HashMap<Character,Integer>();
        for(int i=0;i<str_guess.length;i++){
        	if(str_secret[i]==str_guess[i]){
        		bulls++;
        	}else{
        		if(map1.containsKey(str_secret[i])){
            		int value=map1.get(str_secret[i])+1;
            		map1.replace(str_secret[i], value);
            	}else{
            		map1.put(str_secret[i], 1);
            	}
            	if(map2.containsKey(str_guess[i])){
            		int value=map2.get(str_guess[i])+1;
            		map2.replace(str_guess[i], value);
            	}else{
            		map2.put(str_guess[i], 1);
            	}
        	}
        }
        for(int i=0;i<str_guess.length;i++){
        	if(str_secret[i]!=str_guess[i]){
        		if(map1.containsKey(str_guess[i])){
        			cows++;
        			int value=map1.get(str_guess[i])-1;
        			if(value>0){
        				map1.replace(str_guess[i], value);
        			}else{
        				map1.remove(str_guess[i]);
        			}
        		}
        	}
        }
        return bulls + "A" + cows + "B";
    }
}
