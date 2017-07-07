
public class Solution278 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int firstBadVersion(int n) {
		if(n<=0){
			return 0;
		}
		if(isBadVersion(1)){
			return 1;
		}
		else if(!isBadVersion(n)){
			return Integer.MAX_VALUE;
		}
        int left=1,right=n;
        int mid=0;
        while(true){
        	mid=left+(right-left)/2;
        	if(mid==left){
        		return right;
        	}
        	if(isBadVersion(mid)){
        		right=mid;
        	}
        	else{
        		left=mid;
        	}
        }
    }
	public boolean isBadVersion(int n){
		return true;
	}
}
