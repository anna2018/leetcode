import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Solution414 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={2};
		System.out.println(thirdMax(nums));
	}
	public static int thirdMax(int[] nums) {
		if(nums==null){
			return 0;
		}
		int n=nums.length;
		Arrays.sort(nums);
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			if(!list.contains(nums[i])){
				list.add(nums[i]);
			}
		}
		if(list.size()>=3)
			return list.get(list.size()-3);
		else
			return list.get(list.size()-1);
    }

}
