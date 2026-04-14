class Solution:
    def validPalindrome(self, s: str) -> bool:
        l,r=0,len(s)-1
        while l<r:
            if s[l]!=s[r]:
                return self.checkPallindrom(s,l,r-1) or self.checkPallindrom(s,l+1,r)
            l+=1
            r-=1
        return True
    

    def checkPallindrom(self,s:str,l:int,r:int)->bool:
        while l<r:
            if s[l]!=s[r]:
                return False
            l+=1
            r-=1
        return True
        

        