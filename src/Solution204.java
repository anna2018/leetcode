
public class Solution204 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countPrimes(10));
	}
	public static int countPrimes(int n) {
        int result=0;
        boolean[] flag=new boolean[n];
        if(n<=1){
        	return 0;
        }
        else{
        	for(int i=2;i<Math.sqrt(n);i++){
        		if(flag[i]==false){
        			for(int j=i;i*j<n;j++){
        				flag[i*j]=true;
        			}
        		}
        	}
        	for(int i=2;i<n;i++){
        		if(flag[i]==false){
        			result++;
        		}
        	}
        }
        return result;
    }

}
