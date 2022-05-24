class Solution {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        
        while(i >= 0 || j >= 0){
            int sum = carry;
            
            sum += (i >= 0) ? a.charAt(i--) - '0': 0;
            sum += (j >= 0) ? b.charAt(j--) - '0': 0;
            
            carry = sum > 1 ? 1 : 0;
            res.append(sum % 2);
        }
        if(carry != 0) res.append(carry);
        return res.reverse().toString();
    }
}