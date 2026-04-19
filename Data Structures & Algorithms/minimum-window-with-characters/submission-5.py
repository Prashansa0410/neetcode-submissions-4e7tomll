class Solution:
    def minWindow(self, s: str, t: str) -> str:
        countFreq=Counter(t)
        count=len(countFreq)
        left,right,start=0,0,0
        minLength=float('inf')
        left=0

        ##expanding the window

        while right<len(s):
            if s[right] in countFreq:
                countFreq[s[right]]-=1
                if(countFreq[s[right]]==0):
                    count-=1

            while count==0:
                if right-left+1<minLength:
                    minLength=right-left+1
                    start=left

                if s[left] in countFreq:
                    countFreq[s[left]]+=1
                    if countFreq[s[left]]>0:
                        count+=1
                left+=1
            right+=1

        # Assuming min_length was initialized to float('inf')
        result = "" if minLength == float('inf') else s[start : start + minLength]
        return result





                

            


        
        