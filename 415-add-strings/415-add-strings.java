class Solution {
    public String addStrings(String num1, String num2) {
        
        int l1 = num1.length() - 1;
        int l2 = num2.length() - 1;
        int carry = 0;
        StringBuilder res = new StringBuilder();
        
        while(l1 >= 0 || l2 >= 0){
            int sum = carry;
            sum += (l1 >= 0) ? num1.charAt(l1--) - '0' : 0;
            sum += (l2 >= 0) ? num2.charAt(l2--) - '0' : 0;
            
            carry = sum / 10;
            res.append(sum % 10);
        }
        if(carry != 0) res.append(carry);
        return res.reverse().toString();
    }
}