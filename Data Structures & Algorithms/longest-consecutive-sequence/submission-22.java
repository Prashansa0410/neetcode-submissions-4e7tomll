class Solution {
    public int longestConsecutive(int[] nums) {
        int longest=0;
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }

        for(int num:set){
            if(!set.contains(num-1)){
                int length=1;
                while(set.contains(num+length))
                {
                    length++;
                }

                 longest = Math.max(length,longest);
            }
        }
        return longest;
        
        }
             
    }
      
