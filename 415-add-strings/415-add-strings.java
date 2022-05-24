class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder ans = new StringBuilder();
        int dummy1 = num1.length() - 1;
        int dummy2 = num2.length() - 1;
        int carry = 0;
        
        while(dummy1 >= 0 || dummy2 >= 0){
            int sum = carry;
            sum += (dummy1 >= 0) ? num1.charAt(dummy1--) - '0' : 0;
            sum += (dummy2 >= 0) ? num2.charAt(dummy2--) - '0' : 0;
            
            carry = sum / 10;
            ans.append(sum % 10);
        }
        if(carry != 0) ans.append(carry);
        return ans.reverse().toString();
    }
}