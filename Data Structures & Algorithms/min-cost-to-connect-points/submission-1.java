class Solution {
    public int minCostConnectPoints(int[][] points) {
        Map<Integer,List<int[]>> adj = new HashMap<>();

        //adjacency list
        for(int i=0;i<points.length;i++){
            int x1=points[i][0];
            int y1=points[i][1];
            for(int j=i+1;j<points.length;j++){
                int x2=points[j][0];
                int y2=points[j][1];
                int dis =Math.abs(x2-x1)+Math.abs(y2-y1);

                adj.computeIfAbsent(i,key->(new ArrayList<>())).add(new int[]{dis,j});
                adj.computeIfAbsent(j,key->(new ArrayList<>())).add(new int[]{dis,i});
            }
        }

        Set<Integer> visited = new HashSet<>();
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b)->(a[0]-b[0]));
        minHeap.offer(new int[]{0,0});
        int res=0;
        while(visited.size()<points.length){
            int[] curr=minHeap.poll();
            int cost=curr[0],node = curr[1];
            if(visited.contains(node)){
                continue;
            }
            visited.add(node);
            res+=cost;
            for(int[] nei:adj.getOrDefault(node,Collections.emptyList())){
                int neiCost=nei[0],neiNode=nei[1];
                if(!visited.contains(neiNode)){
                    minHeap.offer(new int[]{neiCost,neiNode});
                }
            }
        }
        return res;
    }
}
