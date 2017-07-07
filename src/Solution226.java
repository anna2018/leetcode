
public class Solution226 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static TreeNode invertTree(TreeNode root) {
        if(root==null){
        	return null;
        }
        if(root.left==null&&root.right==null){
        	return root;
        }
        else{
        	TreeNode left=root.left;
        	root.left=root.right;
        	root.right=left;
        	invertTree(root.left);
        	invertTree(root.right);
        }
        return root;
    }
}
