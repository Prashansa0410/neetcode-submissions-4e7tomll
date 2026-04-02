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
        ListNode secondHalf = reverse(middle.next);
        middle.next=null;
        ListNode firstHalf = head;

        while(secondHalf!=null){
            ListNode tmp1 = firstHalf.next;
            ListNode tmp2 = secondHalf.next;

            firstHalf.next=secondHalf;
            secondHalf.next=tmp1;

            firstHalf=tmp1;
            secondHalf=tmp2;
        }
    }

        public ListNode findMiddle(ListNode head){
            ListNode slow = head;
            ListNode fast = head;

            while(fast!=null && fast.next!=null && fast.next.next!=null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }

        public ListNode reverse(ListNode head){
            if(head==null || head.next==null){
                return head;
            }
            ListNode prev = head;
            ListNode current = head.next;
            while(current!=null){
                ListNode next = current.next;

                current.next=prev;
                prev=current;
                current=next;
            }
            head.next=null;
            head = prev;
            return head;
        }
        
    }
 

