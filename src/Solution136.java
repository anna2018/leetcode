import java.util.ArrayList;
import java.util.List;

public class Solution136 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={1,2,3,2,1};
		System.out.println(singleNumber(nums));
	}
	public static int singleNumber(int[] nums) {
		int result=nums[0];
		for(int i=1;i<nums.length;i++){
			result=result^nums[i];
		}
        return result;
    }

}
