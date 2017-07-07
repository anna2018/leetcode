
public class NumArray {

	int[] sum;
	public NumArray(int[] nums) {
		if(nums.length==0) return;
        sum=new int[nums.length];
        sum[0]=nums[0];
        for(int i=1;i<nums.length;i++){
        	sum[i]=nums[i]+sum[i-1];
        }
    }

    public int sumRange(int i, int j) {
    	if(i>j||i<0||j<0||j>sum.length){
    		return 0;
    	}else if(i!=0){
    		return sum[j]-sum[i-1];
    	}else{
    		return sum[j];
    	}
    }
}
