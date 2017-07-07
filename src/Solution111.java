
public class Solution111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		TreeNode r2 = new TreeNode(2);
		TreeNode r3 = new TreeNode(3);
		TreeNode r4 = new TreeNode(4);
		TreeNode r5 = new TreeNode(5);
		TreeNode r6 = new TreeNode(6);
		TreeNode r7 = new TreeNode(6);
		root.left = r2;
		root.right = r3;
		 r2.left=r4;
		 r2.right=r5;
		 r4.left=r6;
		 r6.left=r7;
//		r2.right = r4;
//		r3.right = r5;
//		r5.left = r6;
		System.out.println(minDepth(root));
	}

	public static int minDepth(TreeNode root) {
		if (root == null)
			return 0;
		if (root.left == null && root.right == null) {
			return 1;
		} else {
			int minLeft = root.left!=null?minDepth(root.left):Integer.MAX_VALUE;
			int minRight = root.right!=null?minDepth(root.right):Integer.MAX_VALUE;
			int min = minLeft < minRight ? minLeft : minRight;
			return min+1;
		}
	}

}
