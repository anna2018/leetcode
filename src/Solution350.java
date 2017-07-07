import java.util.ArrayList;
import java.util.List;

public class Solution350 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1={1,2};
		int[] nums2={1,1};
		int[] r=intersect(nums1,nums2);
		for(int i=0;i<r.length;i++){
			System.out.print(r[i]+"\t");
		}
	}
	public static int[] intersect(int[] nums1, int[] nums2) {
		if(nums1==null||nums2==null)
        	return null;
        if(nums1.length==0||nums2.length==0)
        	return new int[0];;
        List<Integer> list1=new ArrayList<Integer>();
        List<Integer> result=new ArrayList<Integer>();
        int k=0;
        if(nums1.length<nums2.length){
        	int[] temp=nums1;
        	nums1=nums2;
        	nums2=temp;
        }
        for(int i=0;i<nums1.length;i++){
        	list1.add(nums1[i]);
        }
        for(int j=0;j<nums2.length;j++){
    		if(list1.contains(nums2[j])){
    			result.add(nums2[j]);
    			list1.remove((Integer)nums2[j]);
    		}
    	}
        int size=result.size();
        int array[]=new int[size];
        for(int i=0;i<size;i++){
        	array[i]=result.get(i);
        }
        return array;
    }

}
