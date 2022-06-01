class Solution {
    public String removeDigit(String number, char digit) {
        for(int i = 1; i < number.length(); i++){
            
             if(number.charAt(i-1) == digit){
                 if(number.charAt(i) > number.charAt(i-1)){
                     return (number.substring(0,i-1) + number.substring(i));
                 }
             }   
        }
        
        int lastIndex = number.lastIndexOf(digit);
        return (number.substring(0,lastIndex) + number.substring(lastIndex + 1));
    }
}