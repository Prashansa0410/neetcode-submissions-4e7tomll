class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        thisset=set()
        for x in nums:
            if x in thisset:
                return True
            thisset.add(x)
        return False
        