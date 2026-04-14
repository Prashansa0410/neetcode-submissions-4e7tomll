class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        n=len(nums)
        nums1=[0]*n
        k=k%n
        for i in range(len(nums)):
            nums1[(i+k)%n]=nums[i]
        for i in range(len(nums)):
            nums[i]=nums1[i]
        