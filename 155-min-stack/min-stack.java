class MinStack {
    private Deque<Integer> stack;
    private Deque<Integer> minstack;

    public MinStack() {
        stack = new ArrayDeque<>();
        minstack = new ArrayDeque<>();
        
    }
    
    public void push(int value) {
        stack.push(value);
        int currentmin = minstack.isEmpty()? value : Math.min(value,minstack.peek());
        minstack.push(currentmin);
    }
    
    public void pop() {
        stack.pop();
        minstack.pop();
        
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minstack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */