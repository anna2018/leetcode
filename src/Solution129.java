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
        	return 0;//�սڵ�
        if (root.left == null && root.right == null)  
            return sum * 10 + root.val;//���ʽڵ㣬�Ѹ�ĸ�����ϲ��ֵ����10��Ȼ��͵�ǰ�ڵ�ֵ+  
        else//�ѵ�ǰ�ڵ�ֵ�͸�ĸ�����ϲ�ڵ�ֵ*10�������������ݸ���һ��Ϊ��һ��ڵ�ģ���ĸ�����ϲ�ڵ�ֵ��  
            return sumAll(root.left, sum * 10 + root.val)  + sumAll(root.right, sum * 10 + root.val);  
    }  
}
