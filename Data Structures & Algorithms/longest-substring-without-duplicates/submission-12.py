class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        charset=set()
        maximum=0
        i=0
        for j in range(len(s)):
            while s[j] in charset:
                charset.remove(s[i])
                i+=1
            charset.add(s[j])
            maximum=max(maximum,j-i+1)
        return maximum
            

        