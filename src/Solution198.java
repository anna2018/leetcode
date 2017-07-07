
public class Solution198 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={1,2,3,4,5,6,7};
		System.out.println(rob(nums));
	}
	public static int rob(int[] nums) {
        //maxV[i] = max(maxV[i-2]+num[i], maxV[i-1])
        if(nums.length==0){
        	return 0;
        }
        if(nums.length==1){
        	return nums[0];
        }
        int[] maxProfit=new int[nums.length];
        maxProfit[0]=nums[0];
        maxProfit[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++){
        	maxProfit[i]=Math.max(maxProfit[i-2]+nums[i],maxProfit[i-1]);
        }
        return maxProfit[nums.length-1];
    }

}
