class MinStack {

    Stack<Integer> stack ;
    Stack<Integer> minStack ;
 
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
       stack.push(val);
       if(minStack.isEmpty()){
        minStack.push(val);
       }

       else if(val<=minStack.peek()){
        minStack.push(val);
       }
       return;
    }
    
    public void pop() {
      if(stack.isEmpty()){
        return;
      }
      else{
      int topValue=stack.peek();
       if(topValue==minStack.peek()){
        minStack.pop();
      }
      stack.pop();
       
    }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }

}
