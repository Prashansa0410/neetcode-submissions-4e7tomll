class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         Map<Integer,Integer> freqMap = new HashMap<>();
         for(int num:nums){
            freqMap.put(num,freqMap.getOrDefault(num,0)+1);
         }

         PriorityQueue<Map.Entry<Integer,Integer>> queue = new PriorityQueue<>((a,b)->Integer.compare(b.getValue(),a.getValue()));

         for(Map.Entry<Integer,Integer> entry: freqMap.entrySet()){
            queue.add(entry);
         }

         int[] top = new int[k];
         for(int i=k-1;i>=0;i--){
            top[i] = queue.poll().getKey();
         }
         return top;
         }        
}

