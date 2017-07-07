import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<Integer> findSubstring2(String s, String[] words) { 
		List<Integer> ans=new ArrayList<Integer>();
		if(s.length()==0||words.length==0){
			return ans;
		}
		int len=words[0].length();
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		for(int j=0;j<words.length;j++){
			if(map.containsKey(words[j])){
				map.put(words[j], map.get(words[j])+1);
			}else{
				map.put(words[j],1);
			}
		}
		//i的范围很关键，如果直接到S.length()是会超时的  
        for (int i = 0; i <= s.length() - words.length * len; i++) {  
            int from = i;  
            String str = s.substring(from, from + len);  
            int cnt = 0;  
            while (map.containsKey(str) && map.get(str) > 0) {  
                map.put(str, map.get(str) - 1);  
                cnt++;  
                from += len;  
                if (from + len > s.length()) break; //注意越界  
                str = s.substring(from, from + len);  
            }  
              
            //L中每个单词恰好出现一次，加入到结果集  
            if (cnt == words.length) {  
                ans.add(i);  
            }  
              
            //为下一次初始化HashMap  
            if (cnt > 0) {  
                map.clear();  
                for (int j = 0; j < words.length; j++) {  
                    if (map.containsKey(words[j])) {  
                        map.put(words[j], map.get(words[j]) + 1);  
                    } else {  
                        map.put(words[j], 1);  
                    }  
                }  
            }  
        }  
          
        return ans;  
	}
	public ArrayList<Integer> findSubstring(String S, String[] L) {  
	    // Note: The Solution object is instantiated only once and is reused by each test case.  
	    ArrayList<Integer> res = new ArrayList<Integer>();  
	    if(S==null || S.length()==0 || L==null || L.length==0)  
	        return res;  
	    HashMap<String,Integer> map = new HashMap<String,Integer>();  
	    for(int i=0;i<L.length;i++)  
	    {  
	        if(map.containsKey(L[i]))  
	        {  
	            map.put(L[i],map.get(L[i])+1);  
	        }  
	        else  
	        {  
	            map.put(L[i],1);  
	        }  
	    }  
	    for(int i=0;i<L[0].length();i++)  
	    {  
	        HashMap<String,Integer> curMap = new HashMap<String,Integer>();  
	        int count = 0;  
	        int left = i;  
	        for(int j=i;j<=S.length()-L[0].length();j+=L[0].length())  
	        {  
	            String str = S.substring(j,j+L[0].length());  
	              
	            if(map.containsKey(str))  
	            {  
	                if(curMap.containsKey(str))  
	                    curMap.put(str,curMap.get(str)+1);  
	                else  
	                    curMap.put(str,1);  
	                if(curMap.get(str)<=map.get(str))  
	                    count++;  
	                else  
	                {  
	                    while(curMap.get(str)>map.get(str))  
	                    {  
	                        String temp = S.substring(left,left+L[0].length());  
	                        if(curMap.containsKey(temp))  
	                        {  
	                            curMap.put(temp,curMap.get(temp)-1);  
	                            if(curMap.get(temp)<map.get(temp))  
	                                count--;  
	                        }  
	                        left += L[0].length();  
	                    }  
	                }  
	                if(count == L.length)  
	                {  
	                    res.add(left);  
	                    //if(left<)  
	                    String temp = S.substring(left,left+L[0].length());  
	                    if(curMap.containsKey(temp))  
	                        curMap.put(temp,curMap.get(temp)-1);  
	                    count--;  
	                    left += L[0].length();  
	                }  
	            }  
	            else  
	            {  
	                curMap.clear();  
	                count = 0;  
	                left = j+L[0].length();  
	            }  
	        }  
	    }  
	    return res;  
	}  
}
