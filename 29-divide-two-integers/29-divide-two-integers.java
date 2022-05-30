class Solution {
    public int divide(int dividend, int divisor) {
        boolean isNegative = (dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)? true : false;
        
        long absDivident = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);
        long result = 0;
        
        while(absDivident >= absDivisor){
            long temp = absDivisor, count = 1;
            while(temp <= absDivident){
                temp <<= 1;
                count <<= 1;
            }
            result += count >> 1;
            absDivident -= temp >> 1;
        }
        return isNegative ? (int) ~result + 1 : result > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) result;
    }
}