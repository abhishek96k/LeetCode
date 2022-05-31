class Solution {
    public boolean hasAllCodes(String s, int k) {
        int count = 0;
        int start = 0;
        Set seen = new HashSet();
        for(int i = 0; i < s.length(); i++){
            count++;
            if(count==k){
                seen.add(s.substring(start,start+k));
                start++;
                count--;
            }
        }
        return seen.size() == Math.pow(2,k);
    }
}