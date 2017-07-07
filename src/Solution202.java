import java.util.ArrayList;


public class Solution202 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isHappy(1));
	}
	public static boolean isHappy(int n) {
		ArrayList list=new ArrayList();
		return isHappy2(n,list);
	}
	public static boolean isHappy2(int n,ArrayList list) {
        int m=(Integer.toString(n)).length();
        int[] nums=new int[m];
        int sum=0;
        for(int i=m-1;i>=0;i--){
        	nums[i]=n%10;
        	sum+=nums[i]*nums[i];
        	n=n/10;
        }
        if(sum==1){
        	return true;
        }
        else if(list.contains(sum)){
        	return false;
        }
        else{
        	list.add(sum);
        	return isHappy2(sum,list);
        }
    }

}
