class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] reshape = new int[r][c];
        int ri = 0;
        int ci = 0;
        
        if(r*c != mat.length*mat[0].length) {
            return mat;
        }
        
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[i].length; j++) {
                reshape[ri][ci++] = mat[i][j];
                if(ci == c){
                    ci = 0;
                    ++ri;
                }
            }
        }
        return reshape;
    }
}