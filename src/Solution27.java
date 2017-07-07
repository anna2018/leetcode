
public class Solution27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={1,1,2};
		int result=removeElement(nums,2);
		System.out.println("\n"+result);
	}
	public static int removeElement(int[] nums, int val) {
		if(nums==null||nums==new int[0]||nums.length==0){
			return 0;
		}
		int index=0;
		for(int i=0; i<nums.length; i++) {
        	if(nums[i] != val) {
        		nums[index] = nums[i];
        		index++;
        	}
        }
        return index;
    }
}
