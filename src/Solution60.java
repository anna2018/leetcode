import java.util.Vector;

public class Solution60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getPermutation(3,4));
	}
	public static String getPermutation(int n, int k) {
		int[] nums=new int[n];  
        int pCount = 1;  
        for(int i = 0 ; i < n; ++i) {  
            nums[i] = i + 1;  
            pCount *= (i + 1);  
        }  
        k--;  
        String res = "";  
        for(int i = 0 ; i < n; i++) {  
            pCount = pCount/(n-i);  
            int selected = k / pCount;  
            res += nums[selected];  
              
            for(int j = selected; j < n-i-1; j++)  
                nums[j] = nums[j+1];  
            k = k % pCount;  
        }  
        return res; 
    }

}
