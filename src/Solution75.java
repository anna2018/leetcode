import java.util.ArrayList;
import java.util.List;

public class Solution75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]={0};
		sortColors(nums);
		for(int i=0;i<nums.length;i++){
			System.out.print(nums[i]+"   ");
		}
	}
	public static void sortColors(int[] nums) {
		if(nums.length==0||nums.length==1){
			return;
		}
        List<Integer> list0=new ArrayList<Integer>();
        List<Integer> list1=new ArrayList<Integer>();
        List<Integer> list2=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
        	switch(nums[i]){
        	case 0:list0.add(nums[i]);break;
        	case 1:list1.add(nums[i]);break;
        	case 2:list2.add(nums[i]);break;
        	}
        }
        int[] result=new int[nums.length];
        int size0=list0.size();
        int size1=list1.size();
        int size2=list2.size();
        for(int i=0;i<list0.size();i++){
        	result[i]=list0.get(i);
        }
        for(int i=0;i<list1.size();i++){
        	result[i+size0]=list1.get(i);
        }
        for(int i=0;i<list2.size();i++){
        	result[i+size0+size1]=list2.get(i);
        }
        System.arraycopy(result,0,nums,0,result.length);
    }

}
