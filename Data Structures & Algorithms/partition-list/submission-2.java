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
    public ListNode partition(ListNode head, int x) {
        //iterate through the list , have 2 dummy list and values less than x put it in dummy1 and values equal to or greater than goes to dummy2 and then merge the 2 lists.

        ListNode dummy1 = new ListNode(0);
        ListNode curr1 = dummy1;
        ListNode dummy2 = new ListNode(0);
        ListNode curr2 = dummy2;
        ListNode curr=head;
        
        

        while(curr!=null){
            if(curr.val<x){
                curr1.next=curr;
                curr1=curr1.next;
            }
            else{
                curr2.next=curr;
                curr2=curr2.next;
            }
            curr=curr.next;
        }
        curr2.next = null;

        curr1.next=dummy2.next;
        return dummy1.next;
        
    }
}
