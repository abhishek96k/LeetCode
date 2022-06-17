class Solution {
    public int titleToNumber(String columnTitle) {
        if(columnTitle == null) return -1;
        int sum = 0;
        for(char c : columnTitle.toUpperCase().toCharArray()) {
            sum = sum * 26;
            sum = sum + c - 'A' + 1;
        }
        return sum;
    }
}