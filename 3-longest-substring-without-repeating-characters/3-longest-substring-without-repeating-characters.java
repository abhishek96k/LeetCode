class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count = 0;
        int left = 0;
        int right = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(right = 0; right < s.length(); right++){
            char ch = s.charAt(right);
            if(!map.containsKey(ch)){
                map.put(ch, right);
            } else {
                left = Math.max(left, map.get(ch) + 1);
                map.put(ch, right);
            }
            count = Math.max(count, right - left + 1);
        }
        return count;
    }
}