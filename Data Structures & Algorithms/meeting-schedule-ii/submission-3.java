/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        int n = intervals.size();
        int[] start=new int[n];
        int[] end = new int[n];
        int MaxCount=0;

        for(int i=0;i<intervals.size();i++){
            start[i] =intervals.get(i).start;
            end[i]=intervals.get(i).end;
        }
        Arrays.sort(start);
        Arrays.sort(end);

        int str=0,end1=0,count=0;
        while(str<n){
        if(start[str]<end[end1]){
            str++;
            count=count+1;
            if(count > MaxCount) {
                    MaxCount = count;
                }
        }
        else if(start[str]>=end[end1]){
            end1++;
            count=count-1;
        }
        }
        return MaxCount;


    }
}
