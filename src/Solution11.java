
public class Solution11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height={4,6,2,6,7,11,2};
		System.out.println(maxArea(height));
	}
	public static int maxArea(int[] height) {
        int area=0;
        int left=0,right=height.length-1;
        while(left<right){
        	int a1=height[left];
        	int a2=height[right];
        	int temp=Math.min(a1,a2)*(right-left);
        	if(temp>area){
        		area=temp;
        	}
        	if(a1<a2){
        		left++; 
        	}else{
        		right--;  
        	}
        }
        return area;
    }

}
