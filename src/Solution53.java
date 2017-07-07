
public class Solution53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(A));
	}
	public static int maxSubArray(int[] nums) {
        int[] sum = new int[nums.length];
        
        int max = nums[0];
        sum[0] = nums[0];
 
        for (int i = 1; i < nums.length; i++) {
            sum[i] = Math.max(nums[i], sum[i - 1] + nums[i]);
            max = Math.max(max, sum[i]);
        }
 
        return max;
    }

}
