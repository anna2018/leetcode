import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution137 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]={0,1,2,0,1,2,0,1};
		System.out.println(singleNumber(nums));
	}
	public static int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
        	if(!map.containsKey(nums[i])){
        		map.put(nums[i], 1);
        		list.add(nums[i]);
        	}
        	else{
        		int count=map.get(nums[i])+1;
        		if(count==3){
        			map.remove(nums[i]);
        			list.remove((Object)nums[i]);
        		}
        		else{
        			map.replace(nums[i], count);
        		}
        	}
        }
        return list.get(0);
    }
}
