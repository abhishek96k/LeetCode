class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for(int i = 1; i <= n/2; i++) {
            if(n % i == 0) {
                StringBuilder str = new StringBuilder();
                for(int j = 0; j < n/i; j++) {
                    str.append(s.substring(0, i));
                }
                if(s.equals(str.toString())) {
                    return true;
                }
            }
        }
        return false;
    }
}