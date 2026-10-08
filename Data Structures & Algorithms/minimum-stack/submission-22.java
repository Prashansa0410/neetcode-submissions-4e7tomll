class MinStack {
    Stack<Integer> stack ;
        Stack<Integer> minstack ;

    public MinStack() {
        stack = new Stack<>();
        minstack = new Stack<>();
        
    }
    
    public void push(int val) {
        stack.push(val);
        if(minstack.isEmpty() || stack.peek()<=minstack.peek()){
            minstack.push(val);
        }     
    }
    
    public void pop() {
        if(stack.isEmpty()){
            return;
        }
        int val1=stack.pop();
        if(val1==minstack.peek()){
            minstack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
        
    }
    
    public int getMin() {
        return minstack.peek();
        
    }
}
