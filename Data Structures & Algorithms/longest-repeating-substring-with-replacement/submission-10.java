class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int windowSize=0;
        int maxFreq=0;
        int freq=0;

        HashMap<Character,Integer> map = new HashMap<>();

      for(int right=0;right<s.length();right++){
        char ch = s.charAt(right);
        map.put(ch,map.getOrDefault(ch,0)+1);
        freq=map.get(ch);
        maxFreq= Math.max(maxFreq,freq);
        int length= right-left+1;
        if(length-maxFreq>k && left<=right){
            char remove=s.charAt(left);
            map.put(remove,map.get(remove)-1);
            left++;
        }
        windowSize=Math.max(windowSize,right-left+1);


      }
      return windowSize;
    }
}
