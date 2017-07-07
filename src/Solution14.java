
public class Solution14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs={"1234657","1234567890","123","124"};
		System.out.println(longestCommonPrefix(strs));
	}
	public static String longestCommonPrefix(String[] strs) {
		String result="";
		if(strs==null){
			return result;
		}
		int size=strs.length;
		if(size==0){
			return result;
		}
		int len=strs[0].length();
		for(int i=1;i<size;i++){
			if(strs[i].length()<len){
				len=strs[i].length();
			}
		}
		for(int i=0;i<len;i++){
			char c=strs[0].charAt(i);
			int flag=0;
			for(int j=1;j<size;j++){
				if(strs[j].charAt(i)!=c){
					flag=1;
					break;
				}
			}
			if(flag==0){
				result=result+c;
			}else{
				break;
			}
		}
        return result;
    }
}
