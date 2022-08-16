class Solution {
    public int countOdds(int low, int high) {
        int ans = high - low + 1;
        if(low%2 != 0 && high%2 != 0){
            return ans/2 + 1;
        } else {
            return ans/2;
        }
    }
}