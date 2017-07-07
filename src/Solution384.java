import java.util.Random;

public class Solution384 {
	int[] init;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] nums={1,2,3};
		 Solution384 obj = new Solution384(nums);
		 obj.show(obj.init);
		 int[] param_1 = obj.reset();
		 obj.show(param_1);
		 int[] param_2 = obj.shuffle();
		 obj.show(param_2);
	}
	 public Solution384 (int[] nums) {
		 init=nums;   
	 }
	    
	 /** Resets the array to its original configuration and return it. */
	 public int[] reset() {
	    return init;
	 }
	    
	 /** Returns a random shuffling of the array. */
	 public int[] shuffle() {
		 int[] random=new int[init.length];  
	     for (int i = 0; i < random.length; i++) {  
	         random[i]=i;  
	     }  
	     Random r=new Random();  
	     for (int i = random.length-1; i >= 0 ; i--) {  
	         int t=r.nextInt(i+1);  
	         int swap=random[i];  
	         random[i]=random[t];  
	         random[t]=swap;  
	     }  
	     for (int i = 0; i < random.length; i++) {  
	        random[i]=init[random[i]];  
	     }  
	     return random;      
	 }
	 public void show(int[] nums){
		 for(int i=0;i<nums.length;i++){
			 System.out.print(nums[i]+"  ");
		 }
		 System.out.println();
	 }
}
