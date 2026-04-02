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
    public void reorderList(ListNode head) {
        ListNode middle = findMiddle(head);
        ListNode firstHalf = head;
        ListNode secondHalf = reverse(middle.next);
        middle.next = null;

        while(secondHalf!=null){
            ListNode temp1 = firstHalf.next;
            ListNode temp2 = secondHalf.next;

            firstHalf.next=secondHalf;
            secondHalf.next=temp1;

            firstHalf=temp1;
            secondHalf = temp2;
        }
    }

    public ListNode findMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow){
                return slow ;
            }
            
        }
        return slow;
    }

    public ListNode reverse(ListNode head){
        if(head==null || head.next==null){
            return head;
        }

        ListNode prev = head;
        ListNode curr = head.next;

        while(curr!=null){
           ListNode nextNode = curr.next;
           curr.next = prev;
           prev = curr;
           curr = nextNode;
        }

        head.next=null;
        head=prev;
        return head;
         
    }
}
