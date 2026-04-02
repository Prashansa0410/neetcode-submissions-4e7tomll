class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
       Stack<Integer> stack = new Stack<>();
       int n = temperatures.length;
       int[] output = new int[n];
       for(int i=n-1;i>=0;i--){
        if(stack.isEmpty()){
            output[i]=0;
        }
        while(!stack.isEmpty() && temperatures[i]>=temperatures[stack.peek()]){
            stack.pop();
        }
        if(!stack.isEmpty() && temperatures[stack.peek()]>temperatures[i]){
            output[i]=stack.peek()-i;
        }
        stack.push(i);
       }
       return output;

    }
}
