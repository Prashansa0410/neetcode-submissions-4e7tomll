class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        stack=[]
        output =[0]*len(temperatures)
        n=len(temperatures)
        for i in range(n-1,-1,-1):
            while stack and temperatures[stack[-1]]<=temperatures[i]:
                stack.pop()

            if not stack:
                output[i]=0
            else:
                output[i]=stack[-1]-i
            stack.append(i)
               
        return output


        