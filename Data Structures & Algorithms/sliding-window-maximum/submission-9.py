class Solution:
    def maxSlidingWindow(self, nums, k):
        q = deque()
        output = []

        for r in range(len(nums)):
            while q and nums[q[-1]] < nums[r]:
                q.pop()

            q.append(r)

            # remove out-of-window indices
            if q[0] < r - k + 1:
                q.popleft()

            # start recording after first window
            if r >= k - 1:
                output.append(nums[q[0]])

        return output