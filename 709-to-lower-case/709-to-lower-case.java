class Solution {
    public String toLowerCase(String s) {
        char[] a = s.toCharArray();
        for(int i = 0; i < a.length; i++)
            if('A' <= a[i] && a[i] <= 'Z')
                a[i] = (char) (a[i] - 'A' + 'a');
        return new String(a);
    }
}