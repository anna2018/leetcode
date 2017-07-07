import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Solution219 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={1,0,1,1};
		System.out.println(containsNearbyDuplicate(nums,1));
	}
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums==null||nums.length==1||k==0){
        	return false;
        }else{
        	Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        	for(int i=0;i<nums.length;i++){
        		if(map.containsKey(nums[i])){
        			if(i-map.get(nums[i])<=k){
        				return true;
        			}
        			else{
        				map.put(nums[i], i);
        			}
        		}else{
        			map.put(nums[i], i);
        		}
        	}
        	return false;
        }
    }
}
