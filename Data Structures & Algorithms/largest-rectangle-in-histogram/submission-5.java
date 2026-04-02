class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] nsr = new int[n];
        int[] nsl = new int[n];
        int[] width = new int[n];
        int[] area = new int[n];
        int maxArea =0;
        nsr =nsr(heights);
        nsl = nsl(heights);
        for(int i=0;i<n;i++){
            width[i]=nsr[i]-nsl[i]-1;
            area[i] = heights[i]*width[i];
             maxArea= Math.max(maxArea,area[i]);
        } 
        for(int i=0;i<n;i++){ 
        System.out.println(area[i]);
        }
        return maxArea;  
    }
    
        public int[] nsr(int[] heights){
            int n = heights.length;
            int[] nsr = new int[n];
            Stack<Integer> stack = new Stack<>();
            for(int i=n-1;i>=0;i--){
                if(stack.isEmpty()){
                    nsr[i]=n;
                }
                while(!stack.isEmpty() && heights[stack.peek()]>=heights[i]){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    nsr[i]=n;
                }
                if(!stack.isEmpty() && heights[stack.peek()]<heights[i]){
                    nsr[i]=stack.peek();
                }
                stack.push(i);
                
            }
            for(int i=0;i<n;i++){
            System.out.println("nsr::"+nsr[i]);
            }
            return nsr;
        }

        public int[] nsl(int[] heights){
            int n = heights.length;
            int[] nsl = new int[n];
            Stack<Integer> stack = new Stack<>();
            for(int i=0;i<n;i++){
                if(stack.isEmpty()){
                    nsl[i]=-1;
                }
                while(!stack.isEmpty() && heights[stack.peek()]>=heights[i]){
                    stack.pop();
                }
                 if(stack.isEmpty()){
                    nsl[i]=-1;
                }
                if(!stack.isEmpty() && heights[stack.peek()]<heights[i]){
                    nsl[i]=stack.peek();
                }
                stack.push(i);
            }
            for(int i=0;i<n;i++){
            System.out.println("nsl::"+nsl[i]);
            }
            return nsl;
        }
}
