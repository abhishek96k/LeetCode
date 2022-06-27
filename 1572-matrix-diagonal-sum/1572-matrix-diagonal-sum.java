class Solution {
    public int diagonalSum(int[][] mat) {
        int len = mat.length;
        int sum = 0;
        for(int i = 0; i < mat.length; i++) {
            len--;
            sum += mat[i][i];
            if(i == len) continue;
            sum += mat[i][len];
        }
        return sum;
    }
}