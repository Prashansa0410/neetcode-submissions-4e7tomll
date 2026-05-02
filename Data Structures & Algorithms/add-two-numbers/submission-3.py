class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        dummy = ListNode(0) # Use ListNode as defined in the comment
        curr = dummy
        carry = 0
        
        # Continue if there's any data left in l1, l2, OR a remaining carry
        while l1 or l2 or carry:
            # Get values from nodes, or 0 if the list has ended
            val1 = l1.val if l1 else 0
            val2 = l2.val if l2 else 0
            
            # Calculate sum and new carry
            total = val1 + val2 + carry
            carry = total // 10       # Get the carry (e.g., 1 from 15)
            digit = total % 10        # Get the digit to store (e.g., 5 from 15)
            
            # Create new node with the single digit
            curr.next = ListNode(digit)
            curr = curr.next
            
            # Move to the next nodes if they exist
            l1 = l1.next if l1 else None
            l2 = l2.next if l2 else None
            
        return dummy.next
