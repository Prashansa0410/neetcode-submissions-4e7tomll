class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String ch:tokens){
        switch(ch){
            case "+":
                  int val1=stack.pop();
                  int val2=stack.pop();
                  stack.push(val1+val2);
                  break;
            
            case "-":
             val1=stack.pop();
             val2 =stack.pop();
            stack.push(val2-val1);
            break;

            case "*":
            stack.push(stack.pop()*stack.pop());
            break;

            case "/":
             val1= stack.pop();
             val2=stack.pop();

            stack.push(val2/val1);
            break;

             default:
            stack.push(Integer.parseInt(ch));
        
        }
        }
        return stack.pop();
    }
}
