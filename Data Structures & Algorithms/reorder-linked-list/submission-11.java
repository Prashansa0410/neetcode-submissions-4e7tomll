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
        if(head==null || head.next==null){
            return ;
        }

        ListNode firstList=head;
        ListNode middle=findMiddle(head);
        ListNode secondList=reverse(middle.next);
        middle.next=null;

        while(firstList!=null && secondList!=null){
            ListNode first=firstList.next;
            ListNode second=secondList.next;

            firstList.next=secondList;
            secondList.next=first;

            firstList=first;
            secondList=second;


        }
    }

    public ListNode findMiddle(ListNode node){
        ListNode fast=node;
        ListNode slow=node;

        while(fast!=null && fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                break;
            }
        }
               return slow;
    }

    public ListNode reverse(ListNode head){
        ListNode prev =null;
        ListNode curr=head;

        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
