class Solution {
    public int minDeletions(String s) {
        int[] freq = new int[26];
        for(int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        int deleteCount = 0;
        HashSet<Integer> seenFreq = new HashSet<>();
        for(int i = 0; i < 26; i++) {
            while(freq[i] > 0 && seenFreq.contains(freq[i])) {
                freq[i]--;
                deleteCount++;
            }
            seenFreq.add(freq[i]);
        }
        return deleteCount;
    }
}