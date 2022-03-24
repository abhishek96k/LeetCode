class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--){
            if(digits[i] != 9){
                digits[i]++;
                break;
            } else {
                digits[i] = 0; //if least elements in 9 [1,2,9]
            }
        }
        if(digits[0] == 0){
            int[] res = new int[digits.length + 1]; //for [9,9,9] increas array size +1
            res[0] = 1;
            return res;
        }
        return digits;
    }
}