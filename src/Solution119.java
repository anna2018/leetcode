import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution119 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=getRow(2);
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i)+"\t");
		}
		System.out.println();
	}
	public static List<Integer> getRow(int rowIndex) {
		List<Integer> result= new ArrayList<Integer>();
		Queue<Integer> queue=new LinkedList<Integer>();
		if(rowIndex<0){
			return result;
		}
		else if (rowIndex==0){
			result.add(1);
			return result;
		}else{
			queue.add(1);
			for(int i=1;i<=rowIndex;i++){
				result.add(1);
				while(queue.size()>=2){
					int a=queue.poll();
					int b=queue.peek();
					result.add(a+b);
				}
				result.add(1);
				queue.clear();
				for(int j=0;j<result.size();j++){
					queue.add(result.get(j));
				}
				if(rowIndex==i){
					return result;
				}
				result.clear();
			}
		}
		return result;
    }
}
