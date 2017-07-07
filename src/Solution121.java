
public class Solution121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices={};
		System.out.println(maxProfit(prices));
	}
	public static int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
        	if(prices[i]<min){
        		min=prices[i];
        	}
        	if(prices[i]-min>maxProfit){
        		maxProfit=prices[i]-min;
        	}
        }
        return maxProfit;
    }

}
