import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Solution347 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={3,2,3,1,2,4,5,5,6,7,7,8,2,3,1,1,1,10,11,5,6,2,4,7,8,5,6};
		int k=10;
		List<Integer> list=topKFrequent(nums,k);
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
	public static List<Integer> topKFrequent(int[] nums, int k) {
		List<Integer> list=new ArrayList<Integer>();
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		HashMap<Integer,ArrayList<Integer>> map1=new HashMap<Integer,ArrayList<Integer>>();
		if(nums.length==0){
			return list;
		}
		if(nums.length==1&&k==1){
			list.add(nums[0]);
			return list;
		}
		int size=nums.length;
		for(int i=0;i<size;i++){
			if(map.containsKey(nums[i])){
				map.replace(nums[i], map.get(nums[i])+1);
			}
			else{
				map.put(nums[i], 1);
			}
		}
		//对hashmap的value 按照频率进行排序
        List<Integer> values = new ArrayList<Integer>();
        Set<Integer> keys = map.keySet();
        for(Integer key:keys){
            values.add(map.get(key));
            if(map1.containsKey(map.get(key))){
            	ArrayList<Integer> list1=new ArrayList<Integer>();
            	list1=map1.get(map.get(key));
            	list1.add(key);
				map1.replace(map.get(key), list1);
			}
			else{
				ArrayList<Integer> list2=new ArrayList<Integer>();
            	list2.add(key);
				map1.put(map.get(key), list2);
			}
        }
        Collections.sort(values);
        int count=0;
        List<Integer> list4=new ArrayList<Integer>();
        int temp=0;
        //统计频率最高的k个数
        for(int i=0;i<values.size();i++){
        	int t=values.get(values.size()-1-i);
        	if(t!=temp){
        		ArrayList<Integer> list3=map1.get(t);
        		int j=0;
        		while(j<list3.size()){
        			list4.add(list3.get(j));
        			j++;
        		}
        		temp=t;
        	}
        }
        list=list4.subList(0, k);
		return list;
    }

}
