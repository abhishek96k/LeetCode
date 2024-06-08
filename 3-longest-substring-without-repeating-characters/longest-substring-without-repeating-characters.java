class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int ans = 0;

        HashMap<Character, Integer> map = new HashMap<>();
        while(right < s.length()) {
            if(map.containsKey(s.charAt(right))) {
                left = Math.max(map.get(s.charAt(right)) + 1, left);
            }

            map.put(s.charAt(right), right);
            ans = Math.max(ans, right - left + 1);
            right++;
        }
        return ans;
    }
}