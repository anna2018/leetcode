
public class Solution235 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode tr=new TreeNode(6);
		tr.left=new TreeNode(2);
		tr.right=new TreeNode(8);
		tr.left.left=new TreeNode(0);
		tr.left.right=new TreeNode(4);
		tr.left.right.left=new TreeNode(3);
		tr.left.right.right=new TreeNode(5);
		tr.right.left=new TreeNode(7);
		tr.right.right=new TreeNode(9);
		TreeNode t=(lowestCommonAncestor(tr, tr.left,tr.left.right));
		System.out.println(t.val);
	}
	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
        	return null;
        }
        if(root.val==p.val||root.val==q.val){
        	return root;
        }
        else if(p.val<root.val&&q.val<root.val){
        	return lowestCommonAncestor(root.left, p, q);
        }
        else if(p.val>root.val&&q.val>root.val){
        	return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }
}
