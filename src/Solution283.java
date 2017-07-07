import java.util.ArrayList;
import java.util.List;

public class Solution283 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={0,1,0,3,12};
		moveZeroes(nums);
		for(int i=0;i<nums.length;i++){
			System.out.print(nums[i]+"\t");
		}
	}
	public static void moveZeroes(int[] nums) {
        for(int i=0;i<nums.length;i++){
        	if(nums[i]==0){
        		if(i<nums.length-1){
        			int j=i+1;
        			while(j<nums.length&&nums[j]==0){
        				j++;
        			}
        			if(j<nums.length&&i<nums.length){
        				nums[i]=nums[j];
        				nums[j]=0;
        			}
        		}
        		else{
        			break;
        		}
        	}
        }
        
    }

}
