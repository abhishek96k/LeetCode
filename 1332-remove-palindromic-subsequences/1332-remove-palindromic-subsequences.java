class Solution {
    
    // TC: o(n) SC: o(1)
    public int removePalindromeSub(String s) {
        if(s.isBlank()) {
            return 0;
        }
        if(isPalindrome(s)){
            return 1;
        }
        return 2;
    }
    
    private boolean isPalindrome(String s){
        int left = 0;
        int right = s.length() - 1;
        
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
}