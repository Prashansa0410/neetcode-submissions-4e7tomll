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

        ListNode firstList = head;
        ListNode middleList = middle(head);
        ListNode secondList=reverse(middleList.next);
        middleList.next=null;

        while(firstList!=null && secondList!=null){
            ListNode next1=firstList.next;
            ListNode next2=secondList.next;

        firstList.next=secondList;
        secondList.next=next1;
        firstList=next1;
        secondList=next2;
        }



        
        
    }

    public ListNode middle(ListNode head){
        ListNode fast=head;
        ListNode slow=head;

        while(fast!=null && fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast=fast.next.next;

            if(fast==slow){
                break;
            }
        }
        return slow;
    }


    public ListNode reverse(ListNode head){

        if(head==null || head.next==null){
            return head;
        }
        ListNode prev=null;
        ListNode curr=head;

        while(curr!=null){
            ListNode nextnode =curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextnode;
        }
        return prev;
    }
}
