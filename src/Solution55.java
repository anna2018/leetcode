
public class Solution55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={3,2,1,0,4};
		System.out.println(canJump(nums));
	}
	public static boolean canJump(int[] nums) {
		if(nums.length==0||nums.length==1){  
            return true;  
        }
        int step=nums[0];
		for(int i=1;i<nums.length;i++){
			if(step==0){
			    return false;
			}
			step--;
			if(step<nums[i]){
				step=nums[i];
			}
			if(step+i>=nums.length-1){
				return true;
			}
		}
        return false;
    }
}
