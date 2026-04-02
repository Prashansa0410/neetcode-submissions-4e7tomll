class Solution {
    private Stack<Integer> stack;
    private int[] output;
    public int[] dailyTemperatures(int[] temperatures) {
        stack = new Stack<>();
        int n = temperatures.length;
        output= new int[n];
        for(int i=n-1;i>=0;i--){
            if(stack.size()==0){
                output[i]=0;
            }
            else if(stack.size()>0 && temperatures[stack.peek()]>temperatures[i]){
                output[i]=stack.peek()-i;
                stack.push(i);
            }
            else if(stack.size()>0 && temperatures[stack.peek()]<=temperatures[i]){
                while(stack.size()>0 && temperatures[stack.peek()]<=temperatures[i]){
                    stack.pop();
                }
                if(stack.size()==0){
                    output[i]=0;
                }
                else
                output[i]=stack.peek()-i;
            } 
            stack.push(i);       
        }
        return output;
    }          
}

