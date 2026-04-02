
class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int result=0;
        int maxFreq=0;
        int length=0;

    Map<Character,Integer> count = new HashMap<>();
    for(int right=0;right<s.length();right++)
    {
        Character ch = s.charAt(right);
        count.put(ch,count.getOrDefault(ch,0)+1);
        maxFreq =Math.max(maxFreq,count.get(ch));

    if((right-left+1)-maxFreq>k && left<=right){
        Character leftSide = s.charAt(left);
        count.put(leftSide,count.get(leftSide)-1);
        left++;
    }
    result = Math.max(result,right-left+1);
     
    }
      
      return result;
    }
}
