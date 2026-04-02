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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null || lists.length==0){
            return null;
        }
        return mergeLists(lists,0,lists.length-1);
            }

            public ListNode mergeLists(ListNode[] lists,int left,int right){
                if(left==right){
                    return lists[left];
                }
                int mid = left+(right-left)/2;
                ListNode l1 = mergeLists(lists,left,mid);
                ListNode l2 = mergeLists(lists,mid+1,right);
                return merge2Lists(l1,l2);
            }

            public ListNode merge2Lists(ListNode l1, ListNode l2){
                ListNode dummy = new ListNode(0);
                ListNode newHead = dummy;
                while(l1!=null && l2!=null){
                    if(l1.val<=l2.val){
                        newHead.next=l1;
                        l1=l1.next;
                    }
                    else{
                        newHead.next=l2;
                        l2=l2.next;
                    }
                    newHead=newHead.next;
                }

                if(l1!=null){
                    newHead.next=l1;
                }
                else if(l2!=null){
                    newHead.next=l2;
                }
                return dummy.next;
            }
        }

