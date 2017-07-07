
public class Solution34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={5,7,7,8,8,10};
		int target=8;
		int[] res=searchRange(nums, target);
		System.out.println(res[0]+","+res[1]);
	}
	public static int[] searchRange(int[] nums, int target) {
        int[] result={-1,-1};
        if(nums == null || nums.length == 0)
        	 return result;
        int left=0,right=nums.length-1;
        int mid=0;
        while(left<=right){
        	mid=(left+right)/2;
        	if(nums[mid]==target){
        		result[0]=mid;
        		result[1]=mid;
        		break;
        	}else if(nums[mid]>target){
        		right=mid-1;
        	}else{
        		left=mid+1;
        	}
        }
        if(nums[mid]!=target){
        	return result;
        }
        int newleft=mid;
        int newright=nums.length-1;
        int newmid=0;
        while(newleft<=newright){
        	newmid=(newleft+newright)/2;
        	if(nums[newmid]==target){
        		newleft=newmid+1;
        	}else{
        		newright=newmid-1;
        	}
        }
        result[1]=newright;
        int newleft2=0;
        int newright2=mid;
        int newmid2=0;
        while(newleft2<=newright2){
        	newmid2=(newleft2+newright2)/2;
        	if(nums[newmid2]==target){
        		newright2=newmid2-1;
        	}else{
        		newleft2=newmid2+1;
        	}
        }
        result[0]=newleft2;
        return result;
    }

}
