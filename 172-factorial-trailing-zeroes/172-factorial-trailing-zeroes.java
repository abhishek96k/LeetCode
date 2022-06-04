class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        while(n != 0){
            int temp = n / 5;
            count += temp;
            n = temp;
        }
        return count;
    }
}