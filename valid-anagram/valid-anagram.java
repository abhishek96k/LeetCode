class Solution {
    public boolean isAnagram(String s, String t) {
        char[] tempS = s.toCharArray();
        char[] tempT = t.toCharArray();

        Arrays.sort(tempS);
        Arrays.sort(tempT);

        s = new String(tempS);
        t = new String(tempT);

        if(s.contains(t) && t.contains(s)){
            return true;
        } else {
            return false;
        }
    }
}