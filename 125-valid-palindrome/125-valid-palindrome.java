class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()) {
            return true;
        }
        
        int p1 = 0, p2 = s.length() - 1;
        
        while(p1 <= p2) {
            if(!Character.isLetterOrDigit(s.charAt(p1))) {
                p1++;
            } else if(!Character.isLetterOrDigit(s.charAt(p2))) {
                p2--;
            } else {
                if(Character.toLowerCase(s.charAt(p1)) != Character.toLowerCase(s.charAt(p2))) {
                    return false;
                }
                p1++;
                p2--;
            }
        }
        return true;
        
    }
}
// TC : o(n) SC: o(1)