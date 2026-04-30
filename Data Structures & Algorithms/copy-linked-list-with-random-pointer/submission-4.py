"""
# Definition for a Node.
class Node:
    def __init__(self, x: int, next: 'Node' = None, random: 'Node' = None):
        self.val = int(x)
        self.next = next
        self.random = random
"""

class Solution:
    def copyRandomList(self, head: 'Optional[Node]') -> 'Optional[Node]':
        if head is None:
            return None
        # create dictionary of old to new nodes
        old_to_copy={}

        curr=head
        ## 1st Pass to create nodes from already existing nodes and add to dict
        while curr:
            old_to_copy[curr]=Node(curr.val)
            curr=curr.next
         
        curr = head

        ## 2nd Pass
        while curr:
            copy=old_to_copy[curr]
            copy.next=old_to_copy.get(curr.next)
            copy.random=old_to_copy.get(curr.random)
            curr=curr.next

        return old_to_copy.get(head)


        
        