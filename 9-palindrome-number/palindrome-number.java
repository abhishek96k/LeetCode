class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0 || (x != 0 && x % 10 == 0)) return false;

        int num = x;
        int rev = 0;
        while(num > rev) {
            int lastDigit = num % 10;
            rev = rev * 10 + lastDigit;
            num = num / 10;
        }
        return (num == rev / 10 || num == rev);
    }
}