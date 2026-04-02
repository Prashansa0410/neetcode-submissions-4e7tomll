class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> queue = new PriorityQueue<>((a,b)->Integer.compare(b.getValue(),a.getValue()));

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            queue.add(entry);
        } 

        int[] result= new int[k];

        for(int i=0;i<k;i++){
            result[i] = queue.poll().getKey();
        }
        return result;
    }


         
    }

