import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Solution107 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		TreeNode r2=new TreeNode(2);
		TreeNode r3=new TreeNode(3);
		TreeNode r4=new TreeNode(4);
		TreeNode r5=new TreeNode(5);
		TreeNode r6=new TreeNode(6);
		TreeNode r7=new TreeNode(7);
		root.left=r2;
		root.right=r3;
		r2.left=r4;
		r2.right=r5;
		r4.left=r6;
		r6.left=r7;
		List<List<Integer>> list=levelOrderBottom(root);
		for(int i=0;i<list.size();i++){
			List temp=list.get(i);
			for(int j=0;j<temp.size();j++){
				System.out.print(temp.get(j)+"\t");
			}
			System.out.println();
		}
	}
	public static List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		Stack<List<Integer>> stack = new Stack<List<Integer>>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		TreeNode current;
		TreeNode nextLevelStart;
		queue.add(root);
		if (root == null) {
			return list;
		}
		if (root.left != null) {
			nextLevelStart = root.left;
		} else if (root.right != null) {
			nextLevelStart = root.right;
		} else {
			List<Integer> temp = new ArrayList<Integer>();
			temp.add(root.val);
			list.add(temp);
			return list;
		}
		while (!queue.isEmpty()) {
			current = queue.peek();
			List<Integer> temp = new ArrayList<Integer>();
			nextLevelStart = null;
			while (queue.peek() != nextLevelStart && !queue.isEmpty()) {
				current = queue.remove();
				if (nextLevelStart == null) {
					if (current.left != null) {
						nextLevelStart = current.left;
					} else if (root.right != null) {
						nextLevelStart = current.right;
					}
				}
				temp.add(current.val);
				if (current.left != null) {
					queue.add(current.left);
				}
				if (current.right != null) {
					queue.add(current.right);
				}
			}
			//list.add(temp);
			stack.push(temp);
		}
		
		while(!stack.isEmpty()){
			List<Integer> t=stack.pop();
			list.add(t);
		}
		return list;
    }
}
