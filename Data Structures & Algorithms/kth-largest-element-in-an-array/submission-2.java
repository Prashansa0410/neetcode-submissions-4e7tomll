class Solution {
    public int findKthLargest(int[] nums, int k) {
      PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->(b-a));
      for(int num:nums){
        maxHeap.add(num);
      }
      int i=0;
      while(i<k-1){
        maxHeap.poll();
        i++;
      }
      int num= maxHeap.peek();
      return num;
       }
       
       
    }

