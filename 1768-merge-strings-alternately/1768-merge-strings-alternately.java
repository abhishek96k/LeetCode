class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int p1 = 0;
        int p2 = 0;
        StringBuilder ans = new StringBuilder();
        while(p1 < n || p2 < m){
            if(p1 < word1.length())
                ans.append(word1.charAt(p1++));
            if(p2 < word2.length())
                ans.append(word2.charAt(p2++));
        }
        return ans.toString();
    }
}