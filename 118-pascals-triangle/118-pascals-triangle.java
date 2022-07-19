class Solution {
    public List<List<Integer>> generate(int numRows) {
        if(numRows == 0) return new ArrayList<>();         
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < numRows; i++){
        List<Integer> temp = new ArrayList<>();
        for(int j = 0; j <= i; j++){    
            if(j == 0 || j == i){
                temp.add(1);
            } else {
                temp.add(result.get(i-1).get(j) + result.get(i-1).get(j-1));
            }
        }    
            result.add(temp);
            
        }
        return result;
    }
}