import java.util.ArrayList;

public class Solution169 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={1,3,5,2,6,7,8,3,2,3,3,3,3,3};
		System.out.println(majorityElement(nums));
	}
	public static int majorityElement(int[] nums) {
        int majorityElement=nums[0];
//        for(int i=0;i<nums.length-1;i++){
//        	for(int j=i+1;j<nums.length;j++){
//        		if(nums[i]>nums[j]){
//        			int temp=nums[i];
//        			nums[i]=nums[j];
//        			nums[j]=temp;
//        		}
//        	}
//        }
        quickSort(nums, 0,nums.length-1);
//        for(int i=0;i<nums.length;i++){
//        	System.out.print(nums[i]+"\t");
//        }
//        System.out.println();
        int n=(int)Math.floor((double)(nums.length/2));
        majorityElement=nums[n];
        return majorityElement;
    }
	public static void quickSort(int[] numbers, int start, int end) {   
        if (start < end) {   
            int base = numbers[start]; // 选定的基准值（第一个数值作为基准值）   
            int temp; // 记录临时中间值   
            int i = start, j = end;   
            do {   
                while ((numbers[i] < base) && (i < end))   
                    i++;   
                while ((numbers[j] > base) && (j > start))   
                    j--;   
                if (i <= j) {   
                    temp = numbers[i];   
                    numbers[i] = numbers[j];   
                    numbers[j] = temp;   
                    i++;   
                    j--;   
                }   
            } while (i <= j);   
            if (start < j)   
                quickSort(numbers, start, j);   
            if (end > i)   
                quickSort(numbers, i, end);   
        }   
    }   

}
