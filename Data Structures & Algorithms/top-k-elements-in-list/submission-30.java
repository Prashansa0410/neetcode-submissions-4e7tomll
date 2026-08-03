class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> queue = new PriorityQueue<>((a,b)->(a.getValue()-b.getValue()));

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            queue.offer(entry);
            if(queue.size()>k){
                queue.poll();
            }
        }

        int[] top = new int[k];

        for(int i=0;i<k;i++){
            top[i]=queue.poll().getKey();
        }
        return top;
    }
}
