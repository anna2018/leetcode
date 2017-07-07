
public class Solution453 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={1,2,3};
		System.out.println(minMoves(nums));
	}
	public static int minMoves(int[] nums) {
		int min= Integer.MAX_VALUE;  
	    int sum = 0;  
	    for(int n:nums){  
	        min = Math.min(min, n);  
	        sum+=n;  
	    }  
	    return sum-nums.length*min;
    }

}
