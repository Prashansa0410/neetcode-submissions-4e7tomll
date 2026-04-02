class Solution {
    public int lengthOfLongestSubstring(String s) {
        //To maintain the unique characters in a set
        Set<Character> character = new HashSet<>();

        //two pointers to keep track of unique characters
        int left=0,right=0;

        //lonesgtSubstring to keep track of longest substring.
        String longestSubstring ="";

        for(right=0;right<s.length();right++){
            while(character.contains(s.charAt(right))){
                character.remove(s.charAt(left));
                left++;
            }
            character.add(s.charAt(right));

            if(right-left+1>longestSubstring.length()){
                longestSubstring=s.substring(left,right+1);
            }

        }
        
      return longestSubstring.length();

        }
    }

