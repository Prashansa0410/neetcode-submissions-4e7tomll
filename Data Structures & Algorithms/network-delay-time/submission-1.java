class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        //Dijiktra
        //Create a graph first

        Map<Integer,List<int[]>> edges = new HashMap<>();
        Set<Integer> visited = new HashSet<>();
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b)->(a[0]-b[0]));

        for(int[] time:times){
            edges.computeIfAbsent(time[0],key->new ArrayList<>()).add(new int[]{time[1],time[2]});
        }
        
        minHeap.offer(new int[]{0,k});
        int t=0;

        while(!minHeap.isEmpty()){
        int[] curr=minHeap.poll();
        int w1=curr[0],n1=curr[1];
        
        if(visited.contains(n1)){
            continue;
        }

        visited.add(n1);
        t=w1;
        if(edges.containsKey(n1)){
        for(int[] nodeNei:edges.get(n1)){
        int n2=nodeNei[0],w2=nodeNei[1];
        if(!visited.contains(n2)){
        minHeap.offer(new int[]{w2+w1,n2});
            }
        }
        }
        }
        return visited.size()==n?t:-1;
    }
}
