class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int start=intervals[0][0];
        int end =intervals[0][1];
        List<int[]> result = new ArrayList<>();
        int count=0;

        for(int i=1;i<intervals.length;i++){
            int nextStart=intervals[i][0];
            int nextEnd=intervals[i][1];
            if(end>nextStart){
                if(nextEnd>end){
                    result.add(new int[]{start,end});
                    
                }
                else{
                    result.add(new int[]{nextStart,nextEnd});
                    start=nextStart;
                    end=nextEnd;
                }
                 count++;
            }
            else{
                result.add(new int[]{start,end});
                start=intervals[i][0];
                end=intervals[i][1];
            }
        }
        result.add(new int[]{start,end});
        return count;
        
    }
}
