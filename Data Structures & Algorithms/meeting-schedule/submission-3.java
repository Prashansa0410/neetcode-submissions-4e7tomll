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
        Collections.sort(intervals,Comparator.comparingInt(i->i.start));
        for(int i=1;i<intervals.size();i++){
            Interval l1 = intervals.get(i-1);
            Interval l2 = intervals.get(i);
            if(l1.end>l2.start){
                return false;
            }
        }
        return true;
        }
        
    }

