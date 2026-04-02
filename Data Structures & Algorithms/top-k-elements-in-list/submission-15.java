class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freqMap = new HashMap<>();
      
        //Create a bucket of frequencies that holds list of integers

        List<Integer> [] freq = new List[nums.length+1];

        for(int i=0;i<freq.length;i++){
            freq[i] = new ArrayList<>();
        }

        for(int num:nums){
            freqMap.put(num,freqMap.getOrDefault(num,0)+1);
        }

        int index=0;

        for(Map.Entry<Integer,Integer> entry: freqMap.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }
        int[] res = new int[k];

        for(int i=freq.length-1;i>0 && index<k;i--){
            for(int n:freq[i]){
              res[index++]=n;

              if(index==k){
                return res;
              }
            }
        }
        return res;
    }
    }
