import java.util.Arrays;

public class Solution324 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={4,5,5,6};
		wiggleSort(nums);
		for(int i:nums){
			System.out.print(i+",");
		}
	}
	public static void wiggleSort2(int[] nums) {//ÓÐ´íÎó
		int len=nums.length;
        Arrays.sort(nums);
        int[] nums2=new int[len];
        int n1=(int) Math.ceil(len/2.0);
        int i=0,j=n1,k=0;
        while((i<n1||j<len)&&k<len){
        	if(k%2==0){
        		nums2[k]=nums[i];
        		i++;
        	}
        	else{
        		nums2[k]=nums[j];
        		j++;
        	}
        	k++;
        }
        System.arraycopy(nums2, 0, nums, 0, len);
    }
	public static void wiggleSort(int[] nums) {  
        Arrays.sort(nums);  
        int[] temp = new int[nums.length];  
        int s = (nums.length + 1) >> 1,t = nums.length;  
        for (int i = 0; i < nums.length; i++) {  
            temp[i] = (i & 1) == 0 ?  nums[--s] : nums[--t] ;  
        }  
        System.arraycopy(temp, 0, nums, 0, temp.length);
    }
}
