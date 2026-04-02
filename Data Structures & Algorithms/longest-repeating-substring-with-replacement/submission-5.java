class Solution {
    public int characterReplacement(String s, int k) {
      HashMap<Character,Integer> count = new HashMap<>();
      int left=0;
      int result=0;
      int maxF=0;
      for(int right=0;right<s.length();right++){
        Character ch = s.charAt(right);
        count.put(ch,count.getOrDefault(ch,0)+1);
         maxF = Math.max(maxF,count.get(ch));

        int length = right-left+1;
        int ans = length-maxF;

        if(ans>k && left<=right){
          Character c = s.charAt(left);
          count.put(c,count.get(c)-1);
          left++;
        }
        result = Math.max(result,right-left+1);
      }
      return result;
    }
}
