import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Solution18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={-3,-2,-1,0,0,1,2,3};
		int target=0;
		Solution18 s=new Solution18();
		List<List<Integer>> ll=s.fourSum(nums,target);
		for(int i=0;i<ll.size();i++){
			List<Integer> l=ll.get(i);
			for(Integer e:l){
				System.out.print(e+",");
			}
			System.out.println();	
		}
	}
	public List<List<Integer>> fourSum(int[] num, int target) {
	        HashSet<List<Integer>> rs = new HashSet<List<Integer>>();
	        int len = num.length;
	        Arrays.sort(num);
	        if(len <= 3) return new ArrayList<List<Integer>>(rs);
	        
	        for(int i = 0; i < len-3; i++) {
	            for(int k = len-1; k > i+2; k--) {
	                int ab = num[i] + num[k];
	                int c = target-ab;
	                int m = i+1;
	                int n = k-1;
	                while(m < n) {
	                    int sum = num[m] + num[n];
	                    if(sum == c) {
	                        ArrayList elem = new ArrayList();
	                        elem.add(num[i]);
	                        elem.add(num[m]);
	                        elem.add(num[n]);
	                        elem.add(num[k]);
	                        rs.add(elem);
	                        m++;
	                        n--;
	                    }
	                    else if(sum < c) {
	                        m++;
	                    }
	                    else n--;
	                }
	            }
	        }
	        return new ArrayList<List<Integer>>(rs);
	    }
	public List<List<Integer>> list=new ArrayList<List<Integer>>();
	public List<List<Integer>> fourSum2(int[] nums, int target) {
		if(nums==null||nums.length<4){
			return list;
		}
		Arrays.sort(nums);
		for (int i = 0; i < nums.length-3; i++) {  
            if (i > 0 && nums[i] == nums[i-1]) 
            	continue;  
//            System.out.println("nums[i]="+nums[i]+",target="+target);
            threeSum(nums, i+1, nums.length-1, nums[i],target); //寻找三个数与num[i]的和为target  
        } 
        return list;
    }
	public void threeSum(int[] nums,int begin,int end,int result,int target) {
        for (int i = begin; i < end; i++) {  
//            System.out.println("nums[i]="+nums[i]+",result="+result+",target="+target);
            find(nums, i+1, end, nums[i],result,target); //寻找两个数与num[i]的和为0  
        } 
    }
	public void find(int[] nums,int begin,int end,int result,int num3,int target){
		while(begin<end){
//			System.out.println(nums[begin]+"+"+nums[end]+"+"+result+"+"+num3+"="+target);
			if(nums[begin]+nums[end]+result+num3==target){
				List<Integer> temp=new ArrayList<Integer>();
				temp.add(nums[begin]);
				temp.add(nums[end]);
				temp.add(result);
				temp.add(num3);
				if(!list.contains(temp)){
					list.add(temp);
				}
				while(begin<end&&nums[begin]==nums[begin+1]){
					begin++;
				}
				while(begin<end&&nums[end]==nums[end-1]){
					end--;
				}
				begin++;
				end--;
			}else if(nums[begin]+nums[end]+result+num3<target){
				begin++;
			}
			else{
				end--;
			}
		}
	}
}
