class Solution {
    public List<List<Integer>> generate(int numRows) {
        // if numRows == 0 then return empty array
        if(numRows == 0) return new ArrayList<>();         
        List<List<Integer>> result = new ArrayList<>();
        // Loop for each row        
        for(int i = 0; i < numRows; i++){
        // temp for each row
        List<Integer> temp = new ArrayList<>();
        //i is the number of elements in a row. which is always equal to the row number
        for(int j = 0; j <= i; j++){
        //first and last element of a row is always 1    
            if(j == 0 || j == i){
                temp.add(1);
            } else {
                //if element is not first or last then
                //element value = value of(j)+(j-1) elements of previous row
                //here i-1 represents previous row
                temp.add(result.get(i-1).get(j) + result.get(i-1).get(j-1));
            }
        }    
            //add created row from temp to the result
            result.add(temp);
            
        }
        return result;
    }
}