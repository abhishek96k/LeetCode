class Solution {
    int start = 0;
    int end = 0;
    public String longestPalindrome(String s) {
        for(int i = 0; i < s.length(); i++){
            expanAroundCenter(s, i, i);
            expanAroundCenter(s, i, i + 1);
        }
            return s.substring(start, end + 1);
    }
    
    private void expanAroundCenter(String s,int left, int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        left = left + 1;
        right = right - 1;
        if(end - start + 1 < right - left + 1){
            start = left;
            end = right;
        }
    }
}