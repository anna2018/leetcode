import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution90 {

	public static void main(String args[]){
		int[] nums={1,2,2};
		List<List<Integer>>  result=subsetsWithDup(nums);
		for(int i=0;i<result.size();i++){
			List list=result.get(i);
			for(int j=0;j<list.size();j++){
				System.out.print(list.get(j));
			}
			System.out.println();
		}
	}
	public static List<List<Integer>> subsetsWithDup(int[] nums) {
		List<List<Integer>> result=new ArrayList<List<Integer>>();
		List<Integer> list=new ArrayList<Integer>();
		result.add(list);
		if(nums.length==0){
			return result;
		}
		Arrays.sort(nums);
		for(int i=0;i<nums.length;i++)
		{
			list.clear();
			dfs(nums,0,i+1,list,result);
		}
		return result;
		
    }
	public static void dfs(int [] nums, int start, int number, List<Integer> list, List<List<Integer>> result) {  
        if(number==list.size()) {  
            result.add(new ArrayList<Integer>(list));  
            return;  
        }  
        for(int i=start;i<nums.length;i++) {  
            list.add(nums[i]);  
            dfs(nums,i+1,number,list,result);  
            list.remove(list.size()-1); 
            while(i<(nums.length-1)&&nums[i]==nums[i+1]) {  
                i++;  
            }  
        }  
    }  
}
