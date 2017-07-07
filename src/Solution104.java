
public class Solution104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		TreeNode r2=new TreeNode(2);
		TreeNode r3=new TreeNode(3);
		TreeNode r4=new TreeNode(4);
		TreeNode r5=new TreeNode(5);
		TreeNode r6=new TreeNode(6);
		TreeNode r7=new TreeNode(6);
		root.left=r2;
		root.right=r3;
		r2.left=r4;
		r2.right=r5;
		r4.left=r6;
		r6.left=r7;
		System.out.println(maxDepth(root));
	}
	public static int maxDepth(TreeNode root) {
        int maxDepth=0;
        if(root!=null){
        	maxDepth+=1;
        	if(root.left==null&&root.right==null){
        		return maxDepth;
        	}
        	else {
        		int maxLeft=maxDepth(root.left);
        		int maxRight=maxDepth(root.right);
        		int max=maxLeft>maxRight?maxLeft:maxRight;
        		maxDepth+=max;
        	}
        }
        return maxDepth;
    }

}
