
public class Solution98 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(10);
		root.left=new TreeNode(5);
		root.right=new TreeNode(15);
		root.right.left=new TreeNode(6);
		root.right.right=new TreeNode(20);
		Solution98 s=new Solution98();
		System.out.println(s.isValidBST(root));
	}
	TreeNode pre = null;  
    
    public boolean isValidBST(TreeNode root) {  
        // Traverse the tree in inorder.  
        if (root != null) {  
            // Inorder traversal: left first.  
            if (!isValidBST(root.left)) return false;  
              
            // Compare it with the previous value in inorder traversal.  
            if (pre != null && root.val <= pre.val) return false;  
              
            // Update the previous value.  
            pre = root;  
              
            // Inorder traversal: right last.  
            return isValidBST(root.right);  
        }  
        return true;  
    }  
	public static boolean isValidBST2(TreeNode root) {//ÓÐÎÊÌâ
		if(root==null||(root.left==null&&root.right==null)){
			return true;
		}
		if(root.left!=null&&root.right!=null){
			if(root.left.val<root.val&&root.val<root.right.val){
				return (isValidBST2(root.left))&&(isValidBST2(root.right));
			}else{
				return false;
			}
		}
		if(root.left!=null&&root.right==null){
			if(root.left.val<root.val){
				return isValidBST2(root.left);
			}else{
				return false;
			}
		}
		if(root.left==null&&root.right!=null){
			if(root.val<root.right.val){
				return isValidBST2(root.right);
			}else{
				return false;
			}
		}
        return false;
    }
}
