class Solution {
    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        String vowels = "aeiouAEIOU";

        while (start < end) {
            while (start < end && vowels.indexOf(ch[start]) == -1) {
                start++;
            }
            while (start < end && vowels.indexOf(ch[end]) == -1) {
                end--;
            }
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;

            start++;
            end--;
        }
        String ans = new String(ch);
        return ans;
    }
}