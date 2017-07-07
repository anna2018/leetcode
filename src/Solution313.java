
public class Solution313 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] primes={2,3,5};
		System.out.println(nthSuperUglyNumber(10,primes));
	}
	public static int nthSuperUglyNumber(int n, int[] primes) {
		if(n==0||primes.length==0){
			return 0;
		}
		if(n==1){
			return 1;
		}else{
			int[] UglyNumber=new int[n]; 
			UglyNumber[0]=1;
			int[] index=new int[primes.length];
			int count=1;
			while(count<n){
				int[] a=new int[primes.length];
				for(int i=0;i<primes.length;i++){
					a[i]=UglyNumber[index[i]]*primes[i];
				}
				int min=Min(a);
				for(int i=0;i<primes.length;i++){
					if(min==a[i]){
						index[i]++;
					}
				}
				UglyNumber[count]=min;
				count++;
			}
			return UglyNumber[n-1];
		}
        
    }
	public static int Min(int[] a){
		int min=a[0];
		for(int i=1;i<a.length;i++){
			if(a[i]<min){
				min=a[i];
			}
		}
		return min;
	}

}
