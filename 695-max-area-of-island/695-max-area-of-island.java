class Solution {
    int max = 0;
    int maxNow = 0;
    public int maxAreaOfIsland(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1){
                    maxNow = 0;
                    dfs(i, j, grid);}
            }
        }
        return max;
    }
    
    private void dfs(int i, int j, int[][]grid) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != 1)               return;
        grid[i][j] = -1; // marking part of island visited not to check it next time
        maxNow++;
        
        dfs(i - 1, j, grid);
        dfs(i + 1, j, grid);
        dfs(i, j + 1, grid);
        dfs(i, j - 1, grid);

        max = Math.max(max, maxNow);
    }
}