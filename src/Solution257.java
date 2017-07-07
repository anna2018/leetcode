import java.util.ArrayList;
import java.util.List;

public class Solution257 {
	public static List<String> list;
	public static List<String> binaryTreePaths(TreeNode root) {
		list=new ArrayList<String>();
		String str="";
		if(root==null){
			return list;
		}
		else{
			str=str+root.val;
			findPaths(root, str);
		}
		return list;
    }
	private static void findPaths(TreeNode n, String path){
        if(n.left == null && n.right == null) 
        	list.add(path);
        if(n.left != null) 
        	findPaths(n.left, path+"->"+n.left.val);
        if(n.right != null) 
        	findPaths(n.right, path+"->"+n.right.val);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		root.left.right=new TreeNode(5);
		binaryTreePaths(root);
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}

}
