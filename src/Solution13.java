
public class Solution13 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=romanToInt("DCXXI");
		System.out.println(sum);
	}
	public static int romanToInt(String s) {
		if(s==null||s==""){
			return 0;
		}
		int len = s.length();  
        int sum = 0;  
          
        for(int i=0 ;i<len ;i++){  
            if(s.charAt(i)=="I".charAt(0)){  
                if(i!=len-1&&(s.charAt(i+1)=="V".charAt(0)||s.charAt(i+1)=="X".charAt(0))){  
                    sum--;  
                }else{  
                    sum++;  
                }  
            }  
              
            if(s.charAt(i)=="V".charAt(0)){  
                sum+=5;  
            }  
              
            if(s.charAt(i)=="X".charAt(0)){  
                if(i!=len-1&&(s.charAt(i+1)=="C".charAt(0)||s.charAt(i+1)=="L".charAt(0))){  
                    sum-=10;  
                }else{  
                    sum+=10;  
                }  
            }  
              
            if(s.charAt(i)=="L".charAt(0)){  
                sum+=50;  
            }  
              
            if(s.charAt(i)=="C".charAt(0)){  
                if(i!=len-1&&(s.charAt(i+1)=="D".charAt(0)||s.charAt(i+1)=="M".charAt(0))){  
                    sum -= 100;  
                }else{  
                    sum += 100;  
                }  
            }  
              
            if(s.charAt(i)=="D".charAt(0)){  
                sum += 500;  
            }  
              
            if(s.charAt(i)=="M".charAt(0)){  
                sum+=1000;  
            }  
              
              
        }  
        
        return sum;
    }
}
