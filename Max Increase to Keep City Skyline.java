class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int gridSize = grid.length;
        int[] maxRow = new int[gridSize];
		int[] maxCol = new int[gridSize];
		
		//need to find the biggest one
		
		// finds out the max col and row of grid
		for(int i = 0 ; i < gridSize,i++){
			for(int j = 0 ; j < gridSize;j++){
				maxRow[i] = Math.max(maxRow[i],grid[i][j]);
				maxCol[j] = Math.max(maxCol[j],grid[i[j]);
			}
		}
		int sum = 0;
		
		for(int i = 0 ; i < gridSize,i++){
			for(int j = 0 ; j < gridSize;j++){
				sum +=  Math.min(maxRow[i],maxCol[j]) - grid[i][j]  ; 
			}
		}
		return sum;
    }
}
