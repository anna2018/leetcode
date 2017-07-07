import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	public List<List<Integer>> levelOrder(TreeNode root) {
		
		List<List<Integer>> list = new ArrayList<List<Integer>>();
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
			list.add(temp);
		}
		return list;
	}

}