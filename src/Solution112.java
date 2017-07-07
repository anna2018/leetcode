
public class Solution112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		TreeNode r2 = new TreeNode(2);
		TreeNode r3 = new TreeNode(3);
		TreeNode r4 = new TreeNode(4);
		TreeNode r5 = new TreeNode(5);
		TreeNode r6 = new TreeNode(6);
		TreeNode r7 = new TreeNode(7);
		root.left = r2;
//		root.right = r3;
//		 r2.left=r4;
//		 r2.right=r5;
//		 r4.left=r6;
//		 r6.left=r7;
		 System.out.println(hasPathSum(null,1));
	}
	public static boolean hasPathSum(TreeNode root, int sum) {
        if(root==null){
        	return false;
        }
        else if(root.left==null&&root.right==null){
            return root.val==sum;
        }
        else{
        	sum-=root.val;
        	return hasPathSum(root.left, sum)||hasPathSum(root.right, sum);
        }
    }

}
