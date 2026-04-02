class MinStack {
     Stack<Integer> stack = new Stack<>();
     Stack<Integer> minStack = new Stack<>();
    
    
    public void push(int val) {
       stack.push(val);
       if(minStack.size()==0 || stack.peek()<=minStack.peek()){
        minStack.push(val);
       }

    }
    
    public void pop() {
        if(stack.isEmpty()){
            return;
        }
        else {
            int ans = stack.peek();
            stack.pop();
            if(ans==minStack.peek()){
                minStack.pop();
            }
        }

        }
        
        
    
    
    public int top() {
        return stack.peek();
        
    }
    
    public int getMin() {
        
        return minStack.peek();
}
}
