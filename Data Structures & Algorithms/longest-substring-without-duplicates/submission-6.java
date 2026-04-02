class Solution {
    public int lengthOfLongestSubstring(String s) {
       if(s.length()==0 || s==null){
        return 0;
       }
       String longestSubstring="";
       int left =0;
       Set<Character> set = new HashSet<>();
       for(int right=0;right<s.length();right++){
        while(set.contains(s.charAt(right))){
            set.remove(s.charAt(left));
            left++;
        }
        set.add(s.charAt(right));
        if(right-left+1>longestSubstring.length()){
            longestSubstring = s.substring(left,right+1);
        }
       }

         return longestSubstring.length();
    }
    }
      
         
       

    
    


