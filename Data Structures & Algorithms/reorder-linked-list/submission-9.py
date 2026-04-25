# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:
        if not head or not head.next:
            return
        middle = self.findMiddle(head)
        reverse= self.reverse(middle.next)
        middle.next=None
        firsthalf=head
        secondhalf=reverse

        while secondhalf:
            temp1=firsthalf.next
            temp2=secondhalf.next

            firsthalf.next=secondhalf
            secondhalf.next=temp1
            firsthalf=temp1
            secondhalf=temp2

    def reverse(self,head):
        if not head or not head.next:
            return head
        prev=None
        curr=head
        while curr:
            nextnode=curr.next
            curr.next=prev
            prev=curr
            curr=nextnode
        return prev

    def findMiddle(self,head):
        slow=head
        fast=head
        while fast and fast.next and fast.next.next:
            slow=slow.next
            fast=fast.next.next
        return slow

        