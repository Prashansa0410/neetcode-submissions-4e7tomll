class Solution {
    public int lengthOfLongestSubstring(String s) {
      
      Set<Character> set = new HashSet<>();
      int left=0;
      int right=0;
      int longestString=0;
      while(right<s.length()){
        while(set.contains(s.charAt(right))){
          set.remove(s.charAt(left));
          left++;
        }
        set.add(s.charAt(right));
        longestString = Math.max(longestString,right-left+1);
        right++;
      }
      return longestString;
    }
}
