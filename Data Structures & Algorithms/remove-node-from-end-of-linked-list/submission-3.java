/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
      ListNode current = head;
      ListNode prev ;
      int count=0;
      if(head==null || (head.next==null && n==1)){
        return null;
      }

         while(current!=null){
        count++;
        current=current.next;
      }

       if (n == count) {
            return head.next;
        }
   
      current=head;

      int dfs = count-n+1;
      int dfsfp = count-n;

      int track=1;
      while(track!=dfsfp){
        track++;
        current=current.next;
      }
      prev=current;
      prev.next = prev.next.next;
      return head;
    }
}
