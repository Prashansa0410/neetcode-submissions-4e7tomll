class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      //Create a map to store the frequencies of numbers and then using priotirty Queue
      //sort it on the basis of frequncies values
      Map<Integer,Integer> freqNums = new HashMap<>();
      for(int num:nums){
      freqNums.put(num,freqNums.getOrDefault(num,0)+1);
      }

      PriorityQueue<Map.Entry<Integer,Integer>> queue = new PriorityQueue<>((a,b)->(Integer.compare(b.getValue(),a.getValue())));

      for(Map.Entry<Integer,Integer> entry: freqNums.entrySet()){
        queue.add(entry);
      }

      int[] element = new int[k];
      for(int i=k-1;i>=0;i--){
        element[i]=queue.poll().getKey();
      }
      return element;
        
    }
}
