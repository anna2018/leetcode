
public class Solution31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={1,2,3};
		nextPermutation(nums);
		for(int i=0;i<nums.length;i++){
			System.out.print(nums[i]+"\t");
		}
	}
	public static void nextPermutation(int[] nums) {
	    if(nums==null || nums.length==0)  
	        return;  
	    int i = nums.length-2;  
	    while(i>=0 && nums[i]>=nums[i+1])  
	    {  
	        i--;  
	    }  
	    if(i>=0)  
	    {  
	        int j=i+1;  
	        while(j<nums.length && nums[j]>nums[i])  
	        {  
	            j++;  
	        }  
	        j--;  
	        int temp = nums[i];  
	        nums[i] = nums[j];  
	        nums[j] = temp;  
	    }  
	    reverse(nums, i+1);  
	}  
	private static void reverse(int[] nums, int index)  
	{  
	    int l = index;  
	    int r = nums.length-1;  
	    while(l<r)  
	    {  
	        int temp = nums[l];  
	        nums[l] = nums[r];  
	        nums[r] = temp;  
	        l++;  
	        r--;  
	    }  
	}  
}
