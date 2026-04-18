class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        maxf=0
        count={}
        result=0
        left=0
        for right in range(len(s)):
            count[s[right]]=1+count.get(s[right],0)
            maxf = max(count.values())
            while(right-left+1-maxf>k):
                count[s[left]]-=1
                left+=1
            result=max(result,right-left+1)
        return result


        



