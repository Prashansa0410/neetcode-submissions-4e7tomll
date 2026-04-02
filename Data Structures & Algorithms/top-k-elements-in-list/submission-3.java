class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freqMap = new HashMap<>();
        for(int num:nums){
            freqMap.put(num,freqMap.getOrDefault(num,0)+1);
        }
       
       //Create buckets
       int maxFreq = Collections.max(freqMap.values());
       List<List<Integer>> buckets = new ArrayList<>(maxFreq+1);

       //Initialize buckets
       for(int i=0;i<=maxFreq;i++){
        buckets.add(new ArrayList<>());
       }

       //Add the number in the buckets based on freq
       for(Map.Entry<Integer,Integer> entry : freqMap.entrySet()){
        int num = entry.getKey();
        int freq = entry.getValue();

        buckets.get(freq).add(num);
       }

       //get the k most frequency number
       List<Integer> topElements = new ArrayList<>();
       for(int i=maxFreq;i>=0&& topElements.size()<k;i--){
        for(int num:buckets.get(i))
         topElements.add(num);
         if(topElements.size()==k)
         break;
       }
       int[] arrayElements = new int[topElements.size()];
       for(int i=0;i<topElements.size();i++){
        arrayElements[i]= topElements.get(i);
       }
return arrayElements;
    }
}
