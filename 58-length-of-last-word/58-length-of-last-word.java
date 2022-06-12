class Solution {
    public int lengthOfLastWord(String s) {
        int right = s.length() - 1;
        while(right >= 0 && s.charAt(right) == ' '){
            right--;
        }
        int left = right;
        while(left >= 0 && s.charAt(left) != ' '){
            left--;
        }
        return right - left;
    }
}

// TC: o(n) SC: o(1)