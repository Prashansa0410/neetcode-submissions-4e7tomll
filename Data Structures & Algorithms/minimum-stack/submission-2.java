class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    public MinStack() {
      stack = new Stack<>();
      minStack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(minStack.size()==0 || minStack.peek()>=val){
            minStack.push(val);
        }
    }
    
    public void pop() {
        if(stack.size()==0){
            return;
        }
       int val = stack.peek();
       stack.pop();
       if(val==minStack.peek()){
        minStack.pop();
       }
       
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
      return minStack.peek();
    }

}
