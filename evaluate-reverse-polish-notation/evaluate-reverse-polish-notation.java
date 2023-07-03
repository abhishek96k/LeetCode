class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String i : tokens){
            if("+-*/".contains(i)){
                stack.push(eval(stack.pop(), stack.pop(), i));
            } else {
                stack.push(Integer.parseInt(i));
            }
        }
        return stack.pop();
    }

    private int eval(int b, int a, String opt){
        if("+".equals(opt))
            return a + b;
        else if("-".equals(opt))
            return a - b;
        else if("*".equals(opt))
            return a * b;
        else
            return a / b;
    }
}