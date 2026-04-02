class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        Deque<Integer> queue = new LinkedList<>();

        int i=0,j=0;
        while(j<nums.length){
            while(queue.size()>0 && queue.peekLast()<nums[j]){
                queue.pollLast();
            }
            queue.add(nums[j]);

            if(j-i+1<k){
                j++;
            }

            else if(j-i+1==k){
                list.add(queue.peekFirst());
                if(queue.peekFirst()==nums[i]){
                    queue.pollFirst();
                }
                i++;j++;
            }
            
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
