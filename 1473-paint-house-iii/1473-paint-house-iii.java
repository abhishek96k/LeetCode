class Solution {
    private Integer[][][] cache = new Integer[101][21][101];
    private int MAX = (int)1e8;
    private int m, n;
    
    public int minCost(int[] houses, int[][] cost, int m, int n, int target) {
        this.m = m;
        this.n = n;
        int res = dfs(houses, cost, 0, 0, target);
        return res >= MAX ? -1 : res;
    }
    
    private int dfs(int[] houses, int[][] cost, int houseIdx, int prevColor, int target) {
        if (houseIdx == m || target < 0)
            return target == 0 ? 0 : MAX;
        
        if (cache[houseIdx][prevColor][target] != null)
            return cache[houseIdx][prevColor][target];
        
        if (houses[houseIdx] != 0) { // painted
            int curColor = houses[houseIdx];
            cache[houseIdx][prevColor][target] = dfs(houses, cost, houseIdx + 1, curColor, target - (prevColor == curColor ? 0 : 1));
            return cache[houseIdx][prevColor][target];
        }
        
        int res = MAX;
        for (int curColor = 1; curColor <= n; curColor++) {
            res = Math.min(res, dfs(houses, cost, houseIdx + 1, curColor, target - (prevColor == curColor ? 0 : 1)) + cost[houseIdx][curColor - 1]); // add the cost
        }
        cache[houseIdx][prevColor][target] = res;
        return res;
    }
}