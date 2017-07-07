
public class Solution4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1={1,2};
		int[] nums2={3};
		System.out.println(findMedianSortedArrays(nums1, nums2));
	}
	public static double findMedianSortedArrays2(int[] nums1, int[] nums2) {
        double median=0;
        int index1=0,index2=0;
        if((nums1.length+nums2.length)%2==0){
        	index1=(int)Math.floor((nums1.length+nums2.length)/2)-1;
        	index2=index1+1;
        }else{
        	index1=(int)Math.floor((nums1.length+nums2.length)/2);
        	index2=index1;
        }
        int index=0;
        int i=0,j=0;
        while(i<nums1.length&&j<nums2.length){
        	if(nums1[i]<nums2[j]){
        		if(index==index1||index==index2){
            		median+=nums1[i];
            	}
        		i++;
        	}else{
        		if(index==index1||index==index2){
            		median+=nums2[j];
            	}
        		j++;
        	}
        	index++;
        }
        while(i<nums1.length&&index<=index2){
        	if(index==index1||index==index2){
        		median+=nums1[i];
        	}
        	index++;
        	i++;
        }
        while(j<nums2.length&&index<=index2){
        	if(index==index1||index==index2){
        		median+=nums2[j];
        	}
        	index++;
        	j++;
        }
        if(index1!=index2){
        	median=median/2;
        }
        return median;
    }
	public static double findMedianSortedArrays(int A[], int B[]) {
	    int m = A.length;
	    int n = B.length;
	    int total = m+n;
	    if (total%2 != 0)
	        return (double) findKth(A, 0, m-1, B, 0, n-1, total/2+1);//k传得是第k个，index实则k-1
	    else {
	        double x = findKth(A, 0, m-1, B, 0, n-1, total/2);//k传得是第k个，index实则k-1
	        double y = findKth(A, 0, m-1, B, 0, n-1, total/2+1);//k传得是第k个，index实则k-1
	        return (double)(x+y)/2;
	    }
	}
	 
	public static int findKth(int[] A, int astart, int aend, int[] B, int bstart, int bend, int k) {
	    int m = aend - astart + 1;
	    int n = bend - bstart + 1;
	    
	    if(m>n)
	        return findKth(B,bstart,bend,A,astart,aend,k);
	    if(m==0)
	        return B[k-1];
	    if(k==1)
	        return Math.min(A[astart],B[bstart]);
	    
	    int partA = Math.min(k/2,m);
	    int partB = k - partA;
	    if(A[astart+partA-1] < B[bstart+partB-1])
	        return findKth(A,astart+partA,aend,B,bstart,bend,k-partA);
	    else if(A[astart+partA-1] > B[bstart+partB-1])
	        return findKth(A,astart,aend,B,bstart+partB,bend,k-partB);
	    else
	        return A[astart+partA-1];
	}
}




