class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> list = new ArrayList<>();
        int[] currentInterval =intervals[0];
        list.add(intervals[0]);
        for(int[] interval:intervals){
            int currentInterval_end = currentInterval[1];
            int nextIntervalStart = interval[0];
            int nextIntervalEnd = interval[1];
            if(currentInterval_end>=nextIntervalStart){
               currentInterval[1]=Math.max(currentInterval_end,nextIntervalEnd);
            }
            else{
                currentInterval=interval;
                list.add(currentInterval);
            }
        }
        return list.toArray(new int[list.size()][]);
       

    }
}
