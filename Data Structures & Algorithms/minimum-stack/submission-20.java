class MinStack {
    Stack<Integer> stack ;
    Stack<Integer> minStack ; 

    public MinStack() {
         stack = new Stack<>();
         minStack = new Stack<>(); 
    }
    
    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty() || val<=minStack.peek() ){
            minStack.push(val);
        }
    }
    
    public void pop() {
        int top=-1;
        if(!stack.isEmpty()){
             top=stack.pop();
        }
        if(!minStack.isEmpty() && top==minStack.peek()){
            minStack.pop();
        }
        
    }
    
    public int top() {
        int val=-1;
        if(!stack.isEmpty()){
            val=stack.peek();
        }
        return val;
    }
    
    public int getMin() {
        int val=-1;
        if(!minStack.isEmpty()){
            val=minStack.peek();
        }
        return val;
    }
}
