class Solution {
    public int countNegatives(int[][] grid) {
    int res = 0;
    for(int i = 0; i < grid.length; ++i) { 
        res += negativeEachRow(grid[i]);
    }
    return res;
}

private int negativeEachRow(int[] row){

    int res = 0, low = 0, high = row.length - 1;
    while(low <= high){
        int mid = low + (high - low) / 2;
        if(row[mid] >= 0){
            low = mid + 1;
        } else if (row[mid] < 0){
            res += high - mid + 1;
            high = mid - 1;
        }
       }
        return res;
    }
}
