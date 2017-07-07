
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution15 {

	public List<List<Integer>> list=new ArrayList<List<Integer>>();
	
	public List<List<Integer>> threeSum(int[] nums) {
		if(nums==null||nums.length<3){
			return list;
		}
		Arrays.sort(nums);
        for (int i = 0; i < nums.length-2; i++) {  
            if (i > 0 && nums[i] == nums[i-1]) 
            	continue;  
             find(nums, i+1, nums.length-1, nums[i]); //寻找两个数与num[i]的和为0  
        } 
        return list;
    }
	public void find(int[] nums,int begin,int end,int result){
		while(begin<end){
			if(nums[begin]+nums[end]+result==0){
				List<Integer> temp=new ArrayList<Integer>();
				temp.add(nums[begin]);
				temp.add(nums[end]);
				temp.add(result);
				list.add(temp);
				while(begin<end&&nums[begin]==nums[begin+1]){
					begin++;
				}
				while(begin<end&&nums[end]==nums[end-1]){
					end--;
				}
				begin++;
				end--;
			}else if(nums[begin]+nums[end]+result<0){
				begin++;
			}
			else{
				end--;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
