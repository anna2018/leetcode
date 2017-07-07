import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> list=generate(4);
		for(int i=0;i<list.size();i++){
			List temp=list.get(i);
			for(int j=0;j<temp.size();j++){
				System.out.print(temp.get(j)+"\t");
			}
			System.out.println();
		}
	}
	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result= new ArrayList<List<Integer>>();
		Queue<Integer> queue=new LinkedList<Integer>();
		if(numRows<=0){
			return result;
		}
		else if (numRows==1){
			List<Integer> temp=new ArrayList<Integer>();
			temp.add(1);
			result.add(temp);
		}else{
			List<Integer> temp1=new ArrayList<Integer>();
			temp1.add(1);
			result.add(temp1);
			queue.add(1);
			for(int i=2;i<=numRows;i++){
				List<Integer> temp=new ArrayList<Integer>();
				temp.add(1);
				while(queue.size()>=2){
					int a=queue.poll();
					int b=queue.peek();
					temp.add(a+b);
				}
				temp.add(1);
				queue.clear();
				for(int j=0;j<temp.size();j++){
					queue.add(temp.get(j));
				}
				result.add(temp);
			}
		}
		return result;
    }

}
