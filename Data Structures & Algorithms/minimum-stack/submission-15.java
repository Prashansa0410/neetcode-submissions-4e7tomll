class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;
    public MinStack() {
       stack = new Stack();
       minStack = new Stack(); 
    }
    
    public void push(int val) {
        stack.push(val);
        if(minStack.size()==0 || minStack.peek()>=stack.peek()){
            minStack.push(val);
        }  
    }
    
    public void pop() {
        if(stack.size()==0){
            return;
        }
        else {
            int ans= stack.peek();
            stack.pop();
            if(minStack.peek()==ans){
                minStack.pop();
            }
        }
    }
    
    public int top() {
        return stack.peek();
        
    }
    
    public int getMin() {
        if(minStack.size()==0){
            return -1;
        }
        return minStack.peek();
    }
}
