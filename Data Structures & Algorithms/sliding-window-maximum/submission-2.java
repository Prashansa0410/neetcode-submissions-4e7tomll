class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] output = new int[n-k+1];
        int l=0, r=0;

        Deque<Integer> queue = new LinkedList<>();

        while(r<n){
            while(!queue.isEmpty() && nums[queue.getLast()]<nums[r]){
                queue.removeLast();
            }
            queue.addLast(r);

            if(l>queue.getFirst()){
                queue.removeFirst();
            }

            if(r+1>=k){
                output[l]=nums[queue.getFirst()];
                l++;
            }
            r++;
        }
        return output;
        
    }
}
