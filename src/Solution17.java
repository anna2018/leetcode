import java.util.ArrayList;
import java.util.List;

public class Solution17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=letterCombinations("233");
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
	public static List<String> letterCombinations(String digits) {
		List<String> list=new ArrayList<String>();
		if(digits==null||digits.equals("")){
			return list;
		}
        String[] str={"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz","","",""};
        char[] c=digits.toCharArray();
        for(int i=0;i<digits.length();i++){
        	char[] temp1;
        	if(c[i]!='0'){
        		temp1=str[Integer.parseInt(c[i]+"")-1].toCharArray();
        	}else{
        		temp1=str[Integer.parseInt(c[i]+"")+10].toCharArray();
        	}
        	if(list.isEmpty()){
        		for(int j=0;j<temp1.length;j++){
                	list.add(temp1[j]+"");
                }
        	}
        	else{
        		List<String> list1=new ArrayList<String>();
        		for(int k=0;k<list.size();k++){
        			String s=list.get(k);
        			for(int j=0;j<temp1.length;j++){
                    	list1.add(s+temp1[j]);
                    }
        		}
        		list.clear();
        		list=list1;
        	}
        }	
        return list;
    }

}
