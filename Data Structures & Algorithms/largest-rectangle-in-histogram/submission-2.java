class Solution {
    public int largestRectangleArea(int[] heights) {
             int n = heights.length;
        int[] NSL = new int[n];
        int[] NSR = new int[n];
        int[] width = new int[n];
        int[] area = new int[n];

        //nearest smaller to left
        Stack<AbstractMap.SimpleEntry<Integer,Integer>> stack = new Stack<>();
         for(int i=0;i<n;i++){
             while(!stack.isEmpty() && stack.peek().getKey()>= heights[i]){
                 stack.pop();
             }
             NSL[i] = stack.isEmpty()?-1:stack.peek().getValue();
             stack.push(new AbstractMap.SimpleEntry<>(heights[i],i));
         }

         stack.clear();
         //nearest smaller to right
         for(int i=n-1;i>=0;i--){
             while(!stack.isEmpty() && stack.peek().getKey()>=heights[i]){
                 stack.pop();
             }
             NSR[i] = stack.isEmpty()?n:stack.peek().getValue();
             stack.push(new AbstractMap.SimpleEntry<>(heights[i],i));
         }

         for(int i=0;i<n;i++){
             width[i]=NSR[i]-NSL[i]-1;
         }

         for(int i=0;i<n;i++){
             area[i]=heights[i]*width[i];
         }

         int max=0;
         for(int i=0;i<n;i++){
             area[i]=heights[i]*width[i];
             max = Math.max(max,area[i]);
         }
         return max;
    }
}
