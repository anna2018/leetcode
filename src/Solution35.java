
public class Solution35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={1,3,5,6};
		int target=2;
		System.out.println(searchInsert(nums, target));
	}
	public static int searchInsert(int[] nums, int target) {
        int left=0,right=nums.length-1;
        int mid=0;
        while(left<=right){
        	mid=(left+right)/2;
        	if(nums[mid]==target){
        		return mid;
        	}else if(nums[mid]>target){
        		right=mid-1;
        	}else{
        		left=mid+1;
        	}
        }
        return left;
    }

}
