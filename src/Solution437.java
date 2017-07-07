
public class Solution437 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(10);
		TreeNode r2 = new TreeNode(5);
		TreeNode r3 = new TreeNode(-3);
		TreeNode r4 = new TreeNode(3);
		TreeNode r5 = new TreeNode(2);
		TreeNode r6 = new TreeNode(11);
		TreeNode r7 = new TreeNode(3);
		TreeNode r8 = new TreeNode(-2);
		TreeNode r9 = new TreeNode(1);
		root.left = r2;
		root.right = r3;
		 r2.left=r4;
		 r2.right=r5;
		 r3.right=r6;
		 r4.left=r7;
		 r4.right=r8;
		 r5.right=r9;
		 System.out.println(pathSum(root,8));
	}
	public static int pathSum(TreeNode root, int sum) {
		if(root==null){
        	return 0;
        }
		return dfs(root, sum)+pathSum(root.left, sum)+pathSum(root.right, sum);
    }
	public static int dfs(TreeNode root, int sum) {
		int result=0;
        if(root==null){
        	return 0;
        }
        if(root.val==sum){
            result++;
        }
        result+=dfs(root.left,sum - root.val);
        result+=dfs(root.right,sum - root.val);
        return result;
    }

}
