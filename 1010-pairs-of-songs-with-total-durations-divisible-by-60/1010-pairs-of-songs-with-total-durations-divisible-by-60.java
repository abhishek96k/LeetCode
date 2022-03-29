class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int count = 0;
        int[] remainder = new int[60];
        
        for(int t : time){
            if( t%60 == 0 ){
                count = count + remainder[0];
            } else {
                count = count + remainder[60 - t%60];
            }
            remainder[t%60]++; 
        }
        return count;
    }
}