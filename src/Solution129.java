import java.util.ArrayList;
import java.util.List;

public class Solution129 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(0);  
	    TreeNode r;  
	    TreeNode l1=new TreeNode(6);  
	    TreeNode l2=new TreeNode(2);  
	    TreeNode r1=new TreeNode(4);  
	    TreeNode r2=new TreeNode(5);  
	  
	    r=root;  
	    root.right = r1;  
	    root.right.right = r2;  
	    root.left = l1;  
	    root.left.left = l2;  
		System.out.println(sumNumbers(root));
	}
	public static int sumNumbers(TreeNode root) {
		return sumAll(root,0);
    }
	public static int sumAll(TreeNode root, int sum) {  
        if (root == null)
        	return 0;//空节点
        if (root.left == null && root.right == null)  
            return sum * 10 + root.val;//访问节点，把父母及以上层的值乘以10，然后和当前节点值+  
        else//把当前节点值和父母及以上层节点值*10，当做参数传递给下一层为下一层节点的：父母及以上层节点值。  
            return sumAll(root.left, sum * 10 + root.val)  + sumAll(root.right, sum * 10 + root.val);  
    }  
}
