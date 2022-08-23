class Solution {
    public String interpret(String command) {
        StringBuilder ans = new StringBuilder(command.length());
        for(int i = 0; i < command.length(); i++){
            if(command.charAt(i) == 'G')
                ans.append('G');
            if(command.charAt(i) == '('){
                if(command.charAt(i+1) == ')')
                {
                    ans.append('o');
                    i++;
                }
                else {
                    ans.append("al");
                    i = i + 3;
                }
            }
        }
        return ans.toString();
    }
}