class Solution {
    public String longestCommonPrefix(String[] strs) {
        // if(strs.length == 0) return "";
        
        String perfix = strs[0];
        for(int i = 1; i < strs.length; i++){
            while(strs[i].indexOf(perfix) != 0){
                perfix = perfix.substring(0, perfix.length() - 1);
                if(perfix.isEmpty()) return "";
            }
        }
        return perfix;
    }
}