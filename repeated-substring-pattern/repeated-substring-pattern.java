class Solution {
    public boolean repeatedSubstringPattern(String s) {
        for(int i = 1; i <= s.length()/2; i++){
            if(s.length()%i == 0)
            {
                String part = s.substring(0, i);
                int j = i;
                while(j < s.length() && s.substring(j, j+i).equals(part))
                    j+=i;
                if(j==s.length())
                    return true;
            }
        }
        return false;
    }
}