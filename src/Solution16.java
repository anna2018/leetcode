import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution16 {
	public int min=Integer.MAX_VALUE;
	public int sum=0;
	public int threeSumClosest(int[] nums, int target) {
		if(nums==null||nums.length<3){
			return 0;
		}
		Arrays.sort(nums);
        for (int i = 0; i < nums.length-2; i++) {  
            if (i > 0 && nums[i] == nums[i-1]) 
            	continue;  
             find(nums, i+1, nums.length-1, nums[i],target); //寻找两个数与num[i]的和为0  
        } 
        return sum;
    }
	public void find(int[] nums,int begin,int end,int result,int target){
		while(begin<end){
			if(Math.abs(nums[begin]+nums[end]+result-target)<min){
				min=Math.abs(nums[begin]+nums[end]+result-target);
				sum=nums[begin]+nums[end]+result;
				System.out.println(nums[begin]+"+"+nums[end]+"+"+result+"="+sum+",min="+min);
			}
			if(nums[begin]+nums[end]+result<target){
				begin++;
			}
			else{
				end--;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={13,2,0,-14,-20,19,8,-5,-13,-3,20,15,20,5,13,14,-17,-7,12,-6,0,20,-19,-1,-15,-2,8,-2,-9,13,0,-3,-18,-9,-9,-19,17,-14,-19,-4,-16,2,0,9,5,-7,-4,20,18,9,0,12,-1,10,-17,-11,16,-13,-14,-3,0,2,-18,2,8,20,-15,3,-13,-12,-2,-19,11,11,-10,1,1,-10,-2,12,0,17,-19,-7,8,-19,-17,5,-5,-10,8,0,-12,4,19,2,0,12,14,-9,15,7,0,-16,-5,16,-12,0,2,-16,14,18,12,13,5,0,5,6};
		int target=-59;
		Solution16 s=new Solution16();
		System.out.println(s.threeSumClosest(nums,target));
	}
}
