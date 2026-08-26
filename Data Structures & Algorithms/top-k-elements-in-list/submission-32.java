class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Map.Entry<Integer,Integer>> queue = new PriorityQueue<>((a,b)->(a.getValue()-b.getValue()));
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            queue.add(entry);
            if(queue.size()>k){
                queue.poll();
            }
        }

        int[] count = new int[k];
        for(int i=0;i<k;i++){
            count[i]=queue.poll().getKey();
        }
        return count;
        
    }
}
