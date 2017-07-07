
public class Solution240 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix={{1,   4,  7, 11, 15},{2,   5,  8, 12, 19},{3,   6,  9, 16, 22},{10, 13, 14, 17, 24},{18, 21, 23, 26, 30}};
		int target=20;
		System.out.println(searchMatrix(matrix,target));
	}
	public static boolean searchMatrix(int[][] matrix, int target) {
		if(matrix==null||matrix.length==0|| matrix[0].length==0){
			return false;
		}
		int c = matrix[0].length-1;  
	    int r = 0;  
	    while(r<matrix.length&&c>=0)  
	    {    
	        if(matrix[r][c] == target) return true;  
	        if(matrix[r][c] > target)  
	        {  
	            c = c-1;  
	        }  
	        else  
	        {  
	            r = r+1;  
	        }  
	    }  
	    return false;  
    }

}
