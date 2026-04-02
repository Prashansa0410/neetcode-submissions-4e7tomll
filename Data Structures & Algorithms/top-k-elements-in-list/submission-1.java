class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freqMap = new HashMap<>();
        for(int num:nums){
            freqMap.put(num,freqMap.getOrDefault(num,0)+1);
        }
PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));

        for(Map.Entry<Integer,Integer> entry: freqMap.entrySet()){
            queue.add(entry);
            if(queue.size()>k){
                queue.poll();
            }
        }
         int[] num = new int[k];
         for(int i=k-1;i>=0;i--){
            num[i]=queue.poll().getKey();
         }
    return num;
    }
}
