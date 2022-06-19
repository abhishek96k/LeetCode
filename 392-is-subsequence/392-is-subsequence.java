class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.isEmpty()) return true;
        
        int p1 = 0, p2 = 0;
        
        while(p1 < s.length() && p2 < t.length()) {
            
            if(s.charAt(p1) == t.charAt(p2)) {
                p1++;
                p2++;
            } 
            else {
                p2++;
            }
            
            if(p1 == s.length()) {
                return true;
            }
            
        }
        
        return false;
    }
}
// TC: o(max(m,n)) SC: o(1)