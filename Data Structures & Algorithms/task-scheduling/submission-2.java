class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] count = new int[26];

        for(char task:tasks){
            count[task-'A']++;
        }

        //Maxheap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>((a,b)->(b-a));
        Queue<int[]> queue = new LinkedList<>();

        for(int c:count){
            if(c>0){
                maxHeap.offer(c);
            }
        }

        int time=0;
        while(!queue.isEmpty()|| !maxHeap.isEmpty()){
            time++;
       

        if(maxHeap.isEmpty()){
            time=queue.peek()[1];
        }
        else{
             int count1=maxHeap.poll()-1;
             if(count1>0){
                queue.add(new int[]{count1,time+n});
                }

        }

        if(!queue.isEmpty() && queue.peek()[1]==time){
            maxHeap.add(queue.poll()[0]);
        }
        }
        return time;

        
    }
}
