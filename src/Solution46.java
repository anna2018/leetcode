import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candidates = {1,2,3};
		List<List<Integer>> list = permute(candidates);
		for (List<Integer> l : list) {
			for (int e : l) {
				System.out.print(e + "\t");
			}
			System.out.println();
		}
	}
	public static List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		List<Integer> temp = new ArrayList<Integer>();
		if(nums.length==0||nums==null)
            return list;
        boolean[] visited = new boolean[nums.length];  
        
        permutation_helper(nums,list,temp,visited);
        return list;
    }
    
    public static void permutation_helper(int[] num, List<List<Integer>> list, List<Integer> temp,boolean[] visited){
        if(temp.size()==num.length){
            list.add(new ArrayList<Integer>(temp));
            return;
        }
        
        for(int i = 0; i<num.length;i++){
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
