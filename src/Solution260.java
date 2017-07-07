import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution260 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]={1, 2, 1, 3, 2, 5};
		int [] result=singleNumber(nums);
		for(int i=0;i<result.length;i++){
			System.out.print(result[i]+" ");
		}
	}
	public static int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
        	if(!map.containsKey(nums[i])){
        		map.put(nums[i], 1);
        		list.add(nums[i]);
        	}
        	else{
        		int count=map.get(nums[i])+1;
        		if(count==2){
        			map.remove(nums[i]);
        			list.remove((Object)nums[i]);
        		}
        		else{
        			map.replace(nums[i], count);
        		}
        	}
        }
        int[] result=new int[2];
        result[0]=list.get(0);
        result[1]=list.get(1);
        return result;
    }
}
