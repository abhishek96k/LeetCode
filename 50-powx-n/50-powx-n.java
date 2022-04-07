class Solution {
    public double myPow(double x, int n) {
        if(n == 0){
            return 1;
        }
        if(x == 0 || x == 1 || n == 1){
            return x;
        }
        double result = 1;
        if(n < 0){
            x = 1 / x;
            n = -(n + 1);
            result *= x;
        }
        while(n > 0){
            if(n % 2 == 1){
                result *= x;
                n--;
            }
            x *= x;
            n /= 2;
        }
        return result;
    }
}



