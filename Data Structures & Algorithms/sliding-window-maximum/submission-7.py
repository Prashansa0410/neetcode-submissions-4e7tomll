class Solution:
    def maxSlidingWindow(self, nums: List[int], k: int) -> List[int]:
        list1=[]
        for i in range(len(nums)-k+1):
            maximum=max(nums[i : i+k])
            list1.append(maximum)
        return list1

        