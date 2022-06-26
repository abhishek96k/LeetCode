class Solution {
    public void rotate(int[][] matrix) {
        mirrorSecondaryDiagonal(matrix);
        mirrorHorizontally(matrix);
    }
    
    private static void mirrorSecondaryDiagonal(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length - i - 1; j++) {
                int curr = matrix[i][j];
                matrix[i][j] = matrix[matrix.length - j - 1][matrix.length - i - 1];
                matrix[matrix.length - j -1][matrix.length - i - 1] = curr;
            }
        }
    }
    
    private static void mirrorHorizontally(int[][] matrix) {
        for(int i = 0; i < matrix.length / 2; i++) {
            for(int j = 0; j < matrix.length; j++) {
                int curr = matrix[i][j];
                matrix[i][j] = matrix[matrix.length - i -1][j];
                matrix[matrix.length - i - 1][j] = curr;
            }
        }
    }
}
