class MyQueue {

    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>(); 
    
    public void push(int x) {
        input.push(x);
    }
    
    public int pop() {
        int x = peek();
        output.pop();
        return x;
    }
    
    public int peek() {
        if(output.empty())
            while(!input.empty())
                output.push(input.pop());
        return output.peek();
    }
    
    public boolean empty() {
        return input.empty() && output.empty();
    }
}