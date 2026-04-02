class Solution {
    private Stack<Integer> stack = new Stack<>();
    public int evalRPN(String[] tokens) {
       for(String token: tokens){
        switch(token){
            case "+":
            stack.push(stack.pop()+stack.pop());
            break;
            case "-":
            int b = stack.pop();
            int a = stack.pop();
            stack.push(a-b);
            break;
            case "*":
            stack.push(stack.pop()*stack.pop());
            break;
            case "/":
            b = stack.pop();
            a = stack.pop();
            stack.push(a/b);
            break;
            default:
            int number =Integer.parseInt(token);
            stack.push(number);
            break;
        }
        
       }
       return stack.pop();
    }
}
