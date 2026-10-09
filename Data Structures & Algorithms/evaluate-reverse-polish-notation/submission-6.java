class Solution {
    public int evalRPN(String[] tokens) {
      Stack<Integer> stack = new Stack<>();
    
        for(int i=0;i<tokens.length;i++){
            String character = (tokens[i]);
            switch(character){

            case "+":
                stack.push(stack.pop()+stack.pop());
                break;

            case "-":
                int val1=stack.pop();
                int val2=stack.pop();
                stack.push(val2-val1);
                 break;

            case "*":
                stack.push(stack.pop()*stack.pop());
                 break;

            case "/":
                int val3= stack.pop();
                int val4 = stack.pop();
                stack.push(val4/val3);
                 break;

            default:
                stack.push(Integer.parseInt(character));

        }
        }
        return stack.pop();
    }
}
