import java.util.HashSet;
import java.util.Iterator;

public class Solution349 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public static int[] intersection(int[] nums1, int[] nums2) {
        if(nums1==null||nums2==null)
        	return null;
        if(nums1.length==0||nums2.length==0)
        	return new int[0];;
        HashSet<Integer> set1=new HashSet<Integer>();
        HashSet<Integer> result=new HashSet<Integer>();
        int k=0;
        for(int i=0;i<nums1.length;i++){
        	set1.add(nums1[i]);
        }
        for(int j=0;j<nums2.length;j++){
    		if(set1.contains(nums2[j])){
    			result.add(nums2[j]);
    		}
    	}
        int size=result.size();
        int array[]=new int[size];
        Iterator<Integer> it=result.iterator();
        int i=0;
        while(it.hasNext())
        {
            array[i]=(int)it.next();
            i++;
        }
        return array;
    }
}
