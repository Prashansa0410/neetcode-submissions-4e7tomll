class Solution {
    public int characterReplacement(String s, int k) {
      HashMap<Character,Integer> count = new HashMap<>();
      int maxFreq =0;
      int left=0;
      int result=0;
      int freq=0;

      for(int right=0;right<s.length();right++){
        char ch = s.charAt(right);
        count.put(ch,count.getOrDefault(ch,0)+1);
        freq = count.get(ch);
        maxFreq =Math.max(freq,maxFreq);

        int length = right-left+1;

        if(length-maxFreq>k && left<=right){
          ch = s.charAt(left);
          count.put(ch,count.get(ch)-1);
          left++;
        }
        result = Math.max(result,right-left+1);
      }
      return result;
      
    }
}
