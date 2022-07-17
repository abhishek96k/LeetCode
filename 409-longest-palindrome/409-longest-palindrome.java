class Solution {
    public int longestPalindrome(String s) {
        int lowerCase[] = new int[26];
        int upperCase[] = new int[26];
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c-97 >= 0){
                lowerCase[c-97]++;
            } else {
                upperCase[c-65]++;
            }
        }
        
        int ans = 0;
        boolean firstOdd = false;
        
        for(int i = 0; i < 26; i++){
            if(lowerCase[i] % 2 == 0){
                ans += lowerCase[i];
            } else {
                if(firstOdd == false){
                    ans += lowerCase[i];
                    firstOdd = true;
                } else {
                    ans += lowerCase[i] - 1;
                }
            }
        }
        
        for(int i = 0; i < 26; i++){
            if(upperCase[i] % 2 == 0){
                ans += upperCase[i];
            } else {
                if(firstOdd == false){
                    ans += upperCase[i];
                    firstOdd = true;
                } else {
                    ans += upperCase[i] - 1;
                }
            }
        }
            return ans;
    }
}       