
public class Solution167 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers={1,2,3,4,4,9,56,90};
		int target=8;
		int[] index=twoSum(numbers,target);
		for(int i=0;i<index.length;i++){
			System.out.println(index[i]);
		}
	}
	public static int[] twoSum(int[] numbers, int target) {  
        if(numbers==null || numbers.length ==0) 
        	return null;  
        int i=0, j=numbers.length-1;  
        while(i<j) {  
            int x = numbers[i] + numbers[j];  
            if(x<target) {  
                ++i;  
            } else if(x>target) {  
                --j;  
            } else {  
                return new int[]{i+1, j+1};  
            }  
        }  
        return null;  
    }  
	
	public static int[] twoSum2(int[] numbers, int target) {//³¬Ê±
		int[] index=new int[2];
		int n=numbers.length;
		int index1=0;
		int index2=0;
		for(int i=0;i<n-1;i++){
			index1=i+1;
			int temp=find(numbers,target-numbers[i],i);
			if(temp!=-1){
				index2=temp+1;
				index[0]=index1;
		        index[1]=index2;
		        break;
			}
			else{
			    index1=0;
			    index2=0;
			}
		}
        return index;
    }
	public static int find(int[] numbers, int target,int pos) {
		int left=0;
		int right=numbers.length-1;
		int mid=-1;
		while(left<=right){
			mid=(left+right)/2;
			if(numbers[mid]==target&&mid!=pos){
				return mid;
			}
			if(numbers[mid]>target){
				right=mid-1;
			}
			if(numbers[mid]<target){
				left=mid+1;
			}
		}
		return -1;
    }
}
