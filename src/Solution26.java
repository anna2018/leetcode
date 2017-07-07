
public class Solution26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={1,1,1};
		int result=removeDuplicates(nums);
		System.out.println("\n"+result);
	}
	public static int removeDuplicates(int[] nums) {
		if(nums==null||nums==new int[0]||nums.length==0){
			return 0;
		}
		if(nums.length==1){
			return 1;
		}
		int index = 0;
        for(int i=1; i<nums.length; i++) {
        	if(nums[i] != nums[index]) {
        		index++;
        		nums[index] = nums[i];
        	}
        }
        return index+1;
    }
}
