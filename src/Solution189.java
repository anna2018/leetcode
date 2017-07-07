import java.util.Stack;

public class Solution189 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={1};
		int k=2;
		rotate(nums, k);
		for(int i=0;i<nums.length;i++){
			System.out.print(nums[i]+"\t");
		}
		
	}
	public static void rotate(int[] nums, int k) {
		if(k<0){
			return;
		}
        Stack<Integer> stack=new Stack<Integer> ();
        int length=nums.length;
        k=k%length;
        for(int i=0;i<k;i++){
        	stack.add(nums[length-1-i]);
        }
        for(int j=0;j<length-k;j++){
        	nums[length-1-j]=nums[length-1-j-k];
        }
        int m=0;
        while(!stack.isEmpty()){
        	nums[m]=stack.pop();
        	m++;
        }
    }

}
