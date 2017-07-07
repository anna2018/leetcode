
public class Solution1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={2,7,11,15};
		int target=19;
		int[] position=twoSum(nums, target);
		System.out.println(position[0]+"\t"+position[1]);
	}
	public static int[] twoSum(int[] nums, int target) {
		int[] position=new int[2];
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++){
				if((nums[i]+nums[j])==target){
					position[0]=i;
					position[1]=j;
					break;
				}
			}
		}
        return position;
    }
}
