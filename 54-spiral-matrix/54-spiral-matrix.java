class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList();
        
        if(matrix.length == 0) return res;
        
        int beginRow = 0;
        int endRow = matrix.length - 1;
        int beginCol = 0;
        int endCol = matrix[0].length - 1;
        
        while(beginRow <= endRow && beginCol <= endCol){
            
            for(int i = beginCol; i <= endCol; i++){
                res.add(matrix[beginRow][i]);
            }
            beginRow++;
            
            for(int i = beginRow; i <= endRow; i++){
                res.add(matrix[i][endCol]);
            }
            
            endCol--;
            
            if(beginRow <= endRow){
                for(int i = endCol; i >= beginCol; i--){
                    res.add(matrix[endRow][i]);
                }
            }
            
            endRow--;
            
            if(beginCol <= endCol){
                for(int i = endRow; i >= beginRow; i--){
                    res.add(matrix[i][beginCol]);
                }
            }
            beginCol++;
        }
        return res;
    }
}