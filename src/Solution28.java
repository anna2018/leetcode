
public class Solution28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(strStr("bacbababaabcbab","ababa"));
	}
	public static int strStr(String haystack, String needle) {
		if(haystack==null||needle==null){
			return -1;
		}
		if(needle.length()>haystack.length()){
			return -1;
		}
		if(haystack.equals("")){
			if(needle.equals("")){
				return 0;
			}else{
				return -1;
			}
		}
		else{
			if(needle.equals("")){
				return 0;
			}
		}
		int[] next = genNext(needle);
        int j = 0, i = 0;
        while(i < haystack.length()) {
        	if(j==-1 || haystack.charAt(i)==needle.charAt(j)) {
        		i++; j++;
        	}
        	else j = next[j];
        	if(j == needle.length()) {
        		return i-j;
        	}
        }
        return -1;
//		int n=haystack.length();
//		int m=needle.length();
//		char[] T=haystack.toCharArray();
//		char[] P=needle.toCharArray();
//		int[] pi=computerPrefix(needle);
//		int q=0;
//		for(int i=0;i<n;i++){
//			while(q>0&&P[q+1]!=T[i]){
//				q=pi[q];
//			}
//			if(P[q+1]==T[i]){
//				q=q+1;
//			}
//			if(q==m){
//				q=pi[q];
//				return i-m;
//			}
//		}
//        return -1;
    }
	public static int[] genNext(String needle) {
    	int[] next = new int[needle.length()];
    	next[0] = -1;
    	int j = 0, k = -1;
    	while(j < needle.length()-1) {
    		if(k==-1 || needle.charAt(j)==needle.charAt(k)) {
    			j++;
    			k++;
    			next[j] = k; 
    		}else k = next[k];
    	}
    	return next;
    }
	public static int[] computerPrefix(String needle){
		int m=needle.length();
		char[] P=needle.toCharArray();
		int[] pi=new int[m];
		pi[0]=0;
		int k=0;
		for(int q=1;q<m;q++){
			while(k>0&&P[k+1]!=P[q]){
				k=pi[k];
			}
			if(P[k+1]==P[q]){
				k=k+1;
			}
			pi[q]=k;
		}
		return pi;
	}
}
