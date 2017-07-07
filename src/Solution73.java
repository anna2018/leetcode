import java.util.ArrayList;
import java.util.List;

public class Solution73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void setZeroes(int[][] matrix) {
        List<Integer> row=new ArrayList<Integer>();
        List<Integer> col=new ArrayList<Integer>();
        for(int i=0;i<matrix.length;i++){
        	for(int j=0;j<matrix[0].length;j++){
        		if(matrix[i][j]==0){
        			row.add(i);
        			col.add(j);
        		}
        	}
        }
        for(int i=0;i<row.size();i++){
        	int r=row.get(i);
        	for(int j=0;j<matrix[0].length;j++){
        		matrix[r][j]=0;
        	}
        }
        for(int j=0;j<col.size();j++){
        	int c=col.get(j);
        	for(int i=0;i<matrix.length;i++){
        		matrix[i][c]=0;
        	}
        }
    }

}
