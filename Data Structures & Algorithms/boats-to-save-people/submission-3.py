class Solution:
    def numRescueBoats(self, people: List[int], limit: int) -> int:
        people.sort()
        n=len(people)-1
        left,right=0,n
        count=0
        while left<=right:
            if people[left]+people[right]==limit:
                left+=1
                right-=1
            elif people[left]+people[right]>limit:
                right-=1
            else:
                left+=1
                right-=1
            count+=1
        return count


        