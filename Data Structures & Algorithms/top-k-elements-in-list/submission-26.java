class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        List<Integer>[] freq = new ArrayList[nums.length+1];
        for(int i=0;i<freq.length;i++){
            freq[i]=new ArrayList<>();
        }

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }

        int index=0;
        int[] num = new int[k];

        for(int i=freq.length-1;i>=0 && index<k;i--){
            for(int number:freq[i]){
                num[index++]=number;
                if(index>k){
                    break;
                }
            }
        }
        return num;
    }
}
