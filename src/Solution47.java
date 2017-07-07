import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candidates = {3,3,1,2,3,2,3,1};
		List<List<Integer>> list = permuteUnique(candidates);
		for (List<Integer> l : list) {
			for (int e : l) {
				System.out.print(e + "\t");
			}
			System.out.println();
		}
	}
	public static List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		List<Integer> temp = new ArrayList<Integer>();
		if(nums.length==0||nums==null)
            return list;
        boolean[] visited = new boolean[nums.length];  
        Arrays.sort(nums);
        permutation_helper(nums,list,temp,visited);
        return list;
    }
    
    public static void permutation_helper(int[] num, List<List<Integer>> list, List<Integer> temp,boolean[] visited){
        if(temp.size()==num.length){
        	if(!list.contains(temp)){
        		list.add(new ArrayList<Integer>(temp));
        	}
            return;
        }
        
        for(int i = 0; i<num.length;i++){
        	if(i>0 && num[i-1] == num[i] && !visited[i-1])
        		continue;
            if(!visited[i]){
                temp.add(num[i]);
                visited[i]=true;
                permutation_helper(num,list,temp,visited);
                temp.remove(temp.size()-1);
                visited[i]=false;
            }
        }
    }

}
