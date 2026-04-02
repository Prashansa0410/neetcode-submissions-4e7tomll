class Solution {
    public int leastInterval(char[] tasks, int n) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->(b-a));
        int[] counts = new int[26];
        for(char task: tasks){
            counts[task-'A']++;
        }

        for(int count:counts){
            if(count>0){
                maxHeap.offer(count);
            }
        }

        int time=0;
        //to maintain the task left along with when it will be avialble to be processed

        Queue<int[]> queue = new LinkedList<>();
        while(!maxHeap.isEmpty() || !queue.isEmpty()){
            time++;
            if(maxHeap.isEmpty()){
                time = queue.peek()[1];
            }
            else{
                int count=maxHeap.poll()-1;
                if(count>0){
                    queue.add(new int[]{count,time+n});
                }
            }
            if(!queue.isEmpty() && queue.peek()[1]==time){
                maxHeap.add(queue.poll()[0]);
            }
        }
        return time;
        

    }
}
