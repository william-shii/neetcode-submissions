class MinStack {
    private int[] stack;
    private int[] min;
    private int top;
    

    public MinStack() {
        stack = new int[100];
        min = new int[100];
        top = 0;
    }

    public void push(int val) {
        if (top == stack.length) {
            expandCapacity();
        }

        stack[top] = val;
        
        if(top == 0) {
            min[top] = val;
        } else {
            min[top] = Math.min(val, min[top-1]);
        }

        top++;


    }
    
    public void pop() {
        top--;
 
        
    }
    
    public int top() {
        return stack[top-1];
   
    }
    
    public int getMin() {
        return min[top-1];
        
    }

    private void expandCapacity() {
       int[] largerStack = new int[stack.length * 2];
       int[] minStack = new int[min.length * 2];
       for (int i = 0; i < stack.length; i++) {
        largerStack[i] = stack[i];
        minStack[i] = min[i];
       }

       stack = largerStack;
       min = minStack;
    }
}

