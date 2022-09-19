class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        for(int i = 0, count = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0) count = 0;
            else if(++count == 3) return true;
        }
        return false;
    }
}
