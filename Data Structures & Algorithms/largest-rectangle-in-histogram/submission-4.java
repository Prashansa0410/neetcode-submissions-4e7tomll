class Solution {

    public int largestRectangleArea(int[] heights) {
        int size = heights.length;
        int[] NSL = new int[size];
        int[] NSR = new int[size];
        int[] width = new int[size];
        int[] area = new int[size];
        Stack<AbstractMap.SimpleEntry<Integer,Integer>> stack = new Stack<>();

        for(int i=0;i<size;i++){
            while(!stack.isEmpty() && stack.peek().getKey()>=heights[i]){
                stack.pop();
            }
            NSL[i]=stack.isEmpty()?-1:stack.peek().getValue();
            stack.push(new AbstractMap.SimpleEntry(heights[i],i));
        }
        stack.clear();
        for(int i=size-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek().getKey()>=heights[i]){
                stack.pop();
            }
            NSR[i]=stack.isEmpty()?size:stack.peek().getValue();
            stack.push(new AbstractMap.SimpleEntry(heights[i],i));
        }

        for(int i=0;i<size;i++){
            width[i]=NSR[i]-NSL[i]-1;
        }

        int max=0;
        for(int i=0;i<size;i++){
            area[i]=heights[i]*width[i];
            max = Math.max(max,area[i]);
        }
        return max;
    }
}
