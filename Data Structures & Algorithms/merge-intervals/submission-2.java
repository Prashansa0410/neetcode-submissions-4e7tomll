class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> a[0]-b[0]);
        List<int[]> result = new ArrayList<>();
        int current_start =intervals[0][0];
        int current_end= intervals[0][1];

        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=current_end){
                current_end=Math.max(current_end,intervals[i][1]);
            }
            else{
                result.add(new int[]{current_start,current_end});
                current_start=intervals[i][0];
                current_end=intervals[i][1];
            }
        }
            result.add(new int[]{current_start,current_end});
            return result.toArray(new int[result.size()][]);

        
    }
}
