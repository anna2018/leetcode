import java.util.ArrayList;
import java.util.List;

public class Solution95 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public static List<TreeNode> generateTrees2(int n) {
		List<TreeNode> list=new ArrayList<TreeNode>();
		if(n<=0){
			return list;
		}
		if(n==1){
			list.add(new TreeNode(n));
			return list;
		}
		if(n==2){
			TreeNode t1=new TreeNode(n);
			t1.left=new TreeNode(n-1);
			list.add(t1);
			TreeNode t2=new TreeNode(n-1);
			t1.right=new TreeNode(n);
			list.add(t2);
			return list;
		}
		else{
			int[] record = new int[n + 1];
			record[0] = 1;
			record[1] = 1;
			record[2] = 2;
			for (int i = 3; i <= n; i++) {
				int tmp = 0;
				for (int k = 0; k < i; k++) {
					tmp += (record[k] * record[i - k - 1]);
				}
				record[i] = tmp;
			}
			
		}
		return null;
        
    }
	public static List<TreeNode> generateTrees(int n) {
		List<TreeNode> list=new ArrayList<TreeNode>();
		if(n<=0){
			return list;
		}
        return generateTrees(1, n);//从1作为root开始，到n作为root结束
    }
     
    private static ArrayList<TreeNode> generateTrees(int left, int right){
        ArrayList<TreeNode> res = new ArrayList<TreeNode>();
        if (left > right){
            res.add(null);
            return res;
        }
        for (int i = left; i <= right; i++){
            ArrayList<TreeNode> lefts = generateTrees(left, i-1);//以i作为根节点，左子树由[1,i-1]构成
            ArrayList<TreeNode> rights = generateTrees(i+1, right);//右子树由[i+1, n]构成
            for (int j = 0; j < lefts.size(); j++){
                for (int k = 0; k < rights.size(); k++){
                    TreeNode root = new TreeNode(i);
                    root.left = lefts.get(j);
                    root.right = rights.get(k);
                    res.add(root);//存储所有可能行
                }
            }
        }
        return res;
    }

}
