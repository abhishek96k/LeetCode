class MyQueue {
    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        while(!input.isEmpty()){
            output.push(input.pop());
        }
        input.push(x);
        while(!output.isEmpty()){
            input.push(output.pop());
        }
    }
    
    public int pop() {
        if(!input.isEmpty()){
            return input.pop();
        }
        return -1;
    }
    
    public int peek() {
        if(!input.isEmpty()){
            return input.peek();
        }
        return -1;
    }
    
    public boolean empty() {
        return input.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */