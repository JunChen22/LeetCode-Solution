class Solution {
    public int projectionArea(int[][] grid) {
        
        int len = grid.length;

        //3 dimensions
        //x dimensions = # of grid[i] or number of i*i   size
        //y dimensions = sum of biggest number of each grid[][j]  coloum  
        //z dimensions = sum of biggest number of each grid[i][]  row

		int sum = 0;
        
        for(int i = 0 ; i< len ; i++){
        	int col = 0,row = 0;
        	for(int j =  0 ; j < len ; j++){
        		//check if there's cubes on that grid
        		if(grid[i][j]>0) sum++;
        		col = Math.max(col,grid[i][j]);
        		row = Math.max(row,grid[j][i]);
        	}
        	res += col + row  ;
        }	
        return sum;
    }
}