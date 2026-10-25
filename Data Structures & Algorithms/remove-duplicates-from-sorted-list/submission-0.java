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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode prev =dummy;
        ListNode curr = prev.next;

        while(curr!=null && curr.next!=null){
            if(curr.next.val==curr.val){
                prev.next=curr.next;
                curr=prev.next;
            }
            else
            {
                curr=curr.next;
                prev=prev.next;
            }
        }
        return dummy.next;
    }
}
