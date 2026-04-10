class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        set1=set()
        for x in nums:
            set1.add(x)
        if len(set1)==len(nums):
            return False
        return True
        
        