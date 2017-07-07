
public class Solution404 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		root.left.left=new TreeNode(4);
		root.left.right=new TreeNode(5);
		System.out.println(sumOfLeftLeaves(root));
	}
	public static int sumOfLeftLeaves(TreeNode root) {
        int sum=0;
        if(root==null){
        	return 0;
        }
        if(root.left==null&&root.right==null){
        	return 0;
        }
        if(root.left!=null){
        	if(root.left.left==null&&root.left.right==null){
            	sum=root.left.val;
            }
        	sum+=sumOfLeftLeaves(root.left);
        }
        if(root.right!=null){
        	sum+=sumOfLeftLeaves(root.right);
        }
        return sum;
    }

}
