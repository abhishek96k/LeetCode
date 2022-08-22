class Solution {
    public int diagonalSum(int[][] mat) {
        int length = mat.length;
        int ans = 0;
        for(int i = 0; i < mat.length; i++){
            length--;
            ans += mat[i][i];
            if(i == length) continue;
            ans += mat[i][length];
        }
        return ans;
    }
}