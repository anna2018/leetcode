
public class Solution223 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(computeArea(-1500000001,0,-1500000000,1,1500000000,0,1500000001,1));
	}
	public static int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int area=0;
        long area1=0,area2=0,overtappingarea=0;
        area1=(long)(C-A)*(D-B);
        area2=(long)(G-E)*(H-F);
        long l1=(long)Math.max(A, E);
        long l2=(long)Math.min(C, G);
        long l=Math.max(l2-l1,0);
        long h1=(long)Math.max(B,F);
        long h2=(long)Math.min(D,H);
        long h=Math.max(h2-h1,0);
        if(l<0||h<0){
        	overtappingarea=0;
        }
        else{
        	overtappingarea=l*h;
        }
        area=(int)(area1+area2-overtappingarea);
        return area;
    }

}
