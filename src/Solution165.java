
public class Solution165 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="19.8.3.17.5.01.0.0.4.0.0.0.0.0.0.0.0.0.0.0.0.0.00.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.000000.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.1.2";
		String str2="19.8.3.17.5.01.0.0.4.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0000.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.1";
		System.out.println(compareVersion(str1, str2));
	}
	public static int compareVersion(String version1, String version2) {
        if((version1==null&&version2==null)||(version1==""&&version2=="")){
        	return 0;
        }
        if((version2==null||version2=="")&&version1!=null){
        	return 1;
        }
        if((version1==null||version1=="")&&version2!=null){
        	return -1;
        }
        if(version1.contains(".")&&version2.contains(".")){
        	String[] str1=version1.split("\\.");
        	String[] str2=version2.split("\\.");
        	int len1=str1.length;
        	int len2=str2.length;
        	int len =len1>len2?len2:len1;
        	for(int i=0;i<len;i++){
        		if(Integer.parseInt(str1[i])>Integer.parseInt(str2[i])){
        			return 1;
        		}
        		else if(Integer.parseInt(str1[i])<Integer.parseInt(str2[i])){
        			return -1;
        		}
        	}
        	if(len1==len2){
        		return 0;
        	}
        	while(len<len1){
        		if(Integer.parseInt(str1[len])==0){
        			len++;
        		}
        		else{
        			return 1;
        		}
        	}
        	while(len<len2){
        		if(Integer.parseInt(str2[len])==0){
        			len++;
        		}
        		else{
        			return -1;
        		}
        	}
        	return 0;
        }
        else if(version1.contains(".")){
        	String[] str1=version1.split("\\.");
        	if(Double.parseDouble(str1[0])==Double.parseDouble(version2)){
        		if(Double.parseDouble(str1[1])==0&&str1.length==2){
        			return 0;
        		}
        		else{
        			return 1;
        		}
        	}else if(Double.parseDouble(str1[0])<Double.parseDouble(version2)){
        		return -1;
        	}else{
        		return 1;
        	}
        }
        else if(version2.contains(".")){
        	String[] str2=version2.split("\\.");
        	if(Double.parseDouble(str2[0])==Double.parseDouble(version1)){
        		if(Double.parseDouble(str2[1])==0&&str2.length==2)
        			return 0;
        		else{
        			return -1;
        		}
        	}else if(Double.parseDouble(str2[0])<Double.parseDouble(version1)){
        		return 1;
        	}else{
        		return -1;
        	}
        }
        else if(Double.parseDouble(version1)==Double.parseDouble(version2)){
        	return 0;
        }else if(Double.parseDouble(version1)<Double.parseDouble(version2)){
        	return -1;
        }
        else{
        	return 1;
        }
    }

}
