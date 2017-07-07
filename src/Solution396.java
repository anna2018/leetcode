import java.util.LinkedList;
import java.util.Queue;

public class Solution396 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={4,3,2,6};
		System.out.println(maxRotateFunction(A));
	}
	public static int maxRotateFunction(int[] A) {
		//F(1) = F(0) + total - 4×A[A.length-i]  total:数组元素之和
		if(A==null||A.length==0){
			return 0;
		}
        long[] sum=new long[A.length];
        long max=Long.MIN_VALUE;
        long total=0l;
        for(int i=0;i<A.length;i++){
        	sum[0]+=i*A[i];
        	total+=A[i];
        }
        max = Math.max(max,sum[0]);  
        for(int i=1; i<A.length; i++){  
            sum[i] = sum[i-1]+total- A.length*A[A.length-i];  
            max = Math.max(max, sum[i]);  
        }  
        return (int)max;
    }
}
