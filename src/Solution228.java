import java.util.ArrayList;
import java.util.List;

public class Solution228 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={0,1,2,4,5,7};
		List<String> list=summaryRanges(nums);
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
	public static List<String> summaryRanges(int[] nums) {  
        List<String> list = new ArrayList<>();  
        if(nums==null || nums.length<1) 
        	return  list;  
        int start=0, end=0;  
        while(end<nums.length) {  
            if(end+1<nums.length && nums[end+1]==nums[end]+1) {  
            	end++;  
            } else {  
                if(start==end) {  
                	list.add(Integer.toString(nums[start]));  
                } else {  
                    String str = nums[start] + "->" + nums[end];  
                    list.add(str);  
                }  
                ++end;  
                start = end;  
            }  
        }  
        return list;  
    }  

}
