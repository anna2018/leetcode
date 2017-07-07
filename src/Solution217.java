import java.util.HashSet;
import java.util.Set;


public class Solution217 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={1,2,3,4,5,6,4,7,8,9};
		System.out.println(containsDuplicate(nums));
	}
	public static boolean containsDuplicate(int[] nums) {
        if(nums==null||nums.length==1){
        	return false;
        }else{
        	Set<Integer> set=new HashSet<Integer>();
        	for(int i=0;i<nums.length;i++){
        		if(set.contains(nums[i])){
        			return true;
        		}else{
        			set.add(nums[i]);
        		}
        	}
        	return false;
        }
    }

}
