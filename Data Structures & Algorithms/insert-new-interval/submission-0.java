class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] all = new int[intervals.length+1][];

        for(int i=0;i<intervals.length;i++){
            all[i]=intervals[i];
        }

        all[intervals.length]=newInterval;

        Arrays.sort(all,(a,b)->(a[0]-b[0]));
        int start=all[0][0];
        int end=all[0][1];
        List<int[]> result = new ArrayList<>();

        for(int i=1;i<all.length;i++){
            if(all[i][0]<=end){
                end=Math.max(end,all[i][1]);
            }
            else{
                result.add(new int[]{start,end});
                start=all[i][0];
                end=all[i][1];
            }

        }
        result.add(new int[]{start,end});
        return result.toArray(new int[result.size()][]);
    }
}
