
public class Solution264 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(nthUglyNumber(1352));
	}
	public static int nthUglyNumber2(int n) {
		int count=0;
		if(n<=0){
			return 0;
		}
		if(n==1){
			return 1;
		}else{
			int i=2;
			count=1;
			while(count<n){
				int temp=i;
				while(temp%2==0){
					temp=temp/2;
				}
				while(temp%3==0){
					temp=temp/3;
				}
				while(temp%5==0){
					temp=temp/5;
				}
				if(temp==1){
					count++;
				}
				i++;
			}
			return i-1;
		}
    }
	public static int nthUglyNumber(int n) {
		if(n<=0){
			return 0;
		}
		if(n==1){
			return 1;
		}else{
			int[] UglyNumber=new int[n]; 
			UglyNumber[0]=1;
			int index2=0;
			int index3=0;
			int index5=0;
			int count=1;
			while(count<n){
				int a=UglyNumber[index2]*2;
				int b=UglyNumber[index3]*3;
				int c=UglyNumber[index5]*5;
				int min=Min(a,b,c);
				if(min==a){
					index2++;
				}
				if(min==b){
					index3++;
				}
				if(min==c){
					index5++;
				}
				UglyNumber[count]=min;
				count++;
			}
			return UglyNumber[n-1];
		}
    }
	public static int Min(int a,int b,int c){
		int temp=a>b?b:a;
		int min=temp>c?c:temp;
		return min;
	}
}
