class Solution {
    public int trailingZeroes(int n) {
        if (n == 0 || n == 1)
            return 0;
        int count = 0;
        for (int i = 5; i <= n; i = i * 5) {
            count += n / i;
        }
        return count;
    }
}