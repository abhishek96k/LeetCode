class Solution {
    public int subtractProductAndSum(int n) {
        int digit = 1, sum = 0;
        while(n != 0){
            digit *= n % 10;
            sum += n % 10;
            n /= 10;
        }
        return digit - sum;
    }
}