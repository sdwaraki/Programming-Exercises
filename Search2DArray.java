
public class Search2DArray {
	
	

	public static void main(String[] args) {
		Search2DArray s = new Search2DArray();
		int a[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
		System.out.println(s.searchMatrix(a,23));
		
		
	}

	private boolean searchMatrix(int[][] matrix, int target) {
		  int j = matrix[0].length-1;
	        int i = 0;
	        while(j>=0 && i<=matrix.length-1)
	        {
	            if(target==matrix[i][j])
	                return true;
	            else if(target<matrix[i][j])
	                j--;
	            else
	                i++;
	        }
	        return false;
	}

}
