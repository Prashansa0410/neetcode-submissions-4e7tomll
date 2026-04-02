class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      Map<Integer,Integer> freqMap = new HashMap<>();
      Queue<Map.Entry<Integer,Integer>> queue = new PriorityQueue<>((a,b)->Integer.compare(b.getValue(),a.getValue()));
      for(int num:nums){
        freqMap.put(num,freqMap.getOrDefault(num,0)+1);
      }
      for(Map.Entry<Integer,Integer> entry:freqMap.entrySet()){
        queue.add(entry);
      }
     int[] output = new int[k];
      for(int i=k-1;i>=0;i--){
        output[i]=queue.poll().getKey();
      }
      return output;

    }
}
