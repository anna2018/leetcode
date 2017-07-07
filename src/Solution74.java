
public class Solution74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix={{1,3,5,7},{10, 11, 16, 20},{23, 30, 34, 50}};
		int target=3;
		System.out.println(searchMatrix(matrix,target));
	}
	public static boolean searchMatrix(int[][] matrix, int target) {
		if(matrix==null||matrix.length==0|| matrix[0].length==0){
			return false;
		}
		int l = 0;  
	    int r = matrix.length-1;  
	    while(l<=r)  
	    {  
	        int mid = (l+r)/2;  
	        if(matrix[mid][0] == target) return true;  
	        if(matrix[mid][0] > target)  
	        {  
	            r = mid-1;  
	        }  
	        else  
	        {  
	            l = mid+1;  
	        }  
	    }  
	    int row = r;  
	    if(row<0)  
	        return false;  
	    l = 0;  
	    r = matrix[0].length-1;  
	    while(l<=r)  
	    {  
	        int mid = (l+r)/2;  
	        if(matrix[row][mid] == target) return true;  
	        if(matrix[row][mid] > target)  
	        {  
	            r = mid-1;  
	        }  
	        else  
	        {  
	            l = mid+1;  
	        }  
	    }     
	    return false;  
	}
}
