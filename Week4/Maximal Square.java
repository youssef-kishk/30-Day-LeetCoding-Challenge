class Solution {
   public int maximalSquare(char[][] matrix) {
		int rows = matrix.length;
		int cols=0;
		if(rows>0)
			cols = matrix[0].length;
		
        int [][] temp = new int[rows+1][cols+1];
        int op = Integer.MIN_VALUE;
        
        for(int i=0;i<rows;i++) {
        	for(int j=0;j<cols;j++) {
        		if(matrix[i][j]=='1') {
        			temp[i+1][j+1] = Math.min(Math.min(temp[i][j+1], temp[i+1][j]), temp[i][j])+1;
        			op = Math.max(op, temp[i+1][j+1]);
        		}
        		else
        			temp[i+1][j+1]=0;
        	}
        }
        return op*op;
    }
}
