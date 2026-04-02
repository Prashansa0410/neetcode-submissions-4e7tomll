class Solution {
    public int leastInterval(char[] tasks, int n) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->(b-a));

        //convert characters to int array
        int[] counts = new int[26];
        for(int task : tasks){
            counts[task-'A']++;
        }

        for(int count:counts){
            if(count>0){
                maxHeap.add(count);
            }
        }
        Queue<int[]> queue = new LinkedList<>();
        int time=0;

        while(!maxHeap.isEmpty() || !queue.isEmpty()){
            time++;
            if(maxHeap.isEmpty()){
                time = queue.peek()[1];
            }
            else{
                int count = maxHeap.poll()-1;

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
