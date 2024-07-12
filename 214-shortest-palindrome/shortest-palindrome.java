class Solution {
    public String shortestPalindrome(String s) {
        StringBuilder rev = new StringBuilder(s).reverse();

        for(int i = 0; i <= s.length(); i++) {
            if(s.startsWith(rev.substring(i))) {
                return rev.substring(0, i) + s;
            }
        }
        return "";
    }
}