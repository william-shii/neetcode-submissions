class MyQueue {
    private Deque<Integer> stack; //StackADT interface
    private Deque<Integer> stack2; //StackADT interface

    public MyQueue() {
        stack = new ArrayDeque<Integer>(); //New Linked/Array stack
        stack2 = new ArrayDeque<Integer>();//New Linked/Array stack

    }
    
    public void push(int x) {
        stack.push(x); //Push in ArrayDeque method
        
    }
    
    public int pop() {
        if(stack2.isEmpty()) {
            while(!stack.isEmpty()) {
                stack2.push(stack.pop());
            }
        }
        return stack2.pop();
        
    }
    
    public int peek() {
        if(stack2.isEmpty()) {
            while(!stack.isEmpty()) {
                stack2.push(stack.pop());
            }
        }     
        return stack2.peek();   
    }
    
    public boolean empty() {
        return stack.isEmpty() && stack2.isEmpty();
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