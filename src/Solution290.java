
public class Solution290 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(wordPattern("aaaa","dog cat cat dog"));
	}
	public static boolean wordPattern(String pattern, String str) {
		String[] res=str.split(" ");
		if(res.length!=pattern.length()){
			return false;
		}
		for(int i=0;i<res.length-1;i++){
			int j=i+1;
			while(j<res.length){
				if(pattern.charAt(i)==pattern.charAt(j)^res[i].equals(res[j])){
					return false;
				}
				j++;
			}
		}
        return true;
    }

}
