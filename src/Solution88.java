
public class Solution88 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1=new int[6];
		nums1[0]=1;
		nums1[1]=2;
		nums1[2]=3;
		nums1[3]=0;
		nums1[4]=0;
		nums1[5]=0;
		int[] nums2={2,5,6};
		merge(nums1,3,nums2,3);
		for(int i=0;i<nums1.length;i++){
			System.out.print(nums1[i]+"\t");
		}
	}
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		if(m==0&&n==0){
			return;
		}
		if(m==0&&n!=0){
			System.arraycopy(nums2, 0, nums1, 0, nums2.length);
			return;
		}
		if(m!=0&&n==0){
			return;
		}
        int min=m<n?m:n;
        int i=0;
        int j=0;
        int length=nums1.length;
        int[] result=new int[length];
        int k=0;
        while(i<m&&j<n){
        	if(nums1[i]>nums2[j]){
        		result[k]=nums2[j];
        		j++;
        		k++;
        	}
        	else{
        		result[k]=nums1[i];
        		i++;
        		k++;
        	}
        }
        while(i<m){
        	result[k]=nums1[i];
    		i++;
    		k++;
        }
        while(j<n){
        	result[k]=nums2[j];
    		j++;
    		k++;
        }
        System.arraycopy(result, 0, nums1, 0, length);
    }
}
