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
    public boolean canAttendMeetings(List<Interval> intervals) {
        //sort based on the start time first
        
        for(int i=0;i<intervals.size();i++){
            for(int j=i+1;j<intervals.size();j++){
                if(Math.min(intervals.get(i).end,intervals.get(j).end)>Math.max(intervals.get(i).start,intervals.get(j).start)){
                    return false;
                }
                }
            }
            return true;
        }
        
    }

