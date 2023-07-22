class Solution {
    public void rotate(int[][] matrix) {
       int row = matrix.length;
       Stack<Integer> stack = new Stack<>();
       for(int i = 0; i < row; i++) {
           for(int j = 0; j < row; j++) {
               stack.push(matrix[i][j]);
           }
       }

       for(int i = 0; i < row; i++) {
           for(int j = row - 1; j >= 0; j--){
               matrix[j][i] = stack.pop();
           }
       } 
    }
}