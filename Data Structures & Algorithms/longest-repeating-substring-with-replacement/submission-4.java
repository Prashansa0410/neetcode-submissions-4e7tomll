class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int result =0;
        int maxFreq = 0;
        HashMap<Character,Integer> map = new HashMap<>();



        for(int right=0;right<s.length();right++){

            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
            int length = right-left+1;
            maxFreq = Math.max(maxFreq,map.get(s.charAt(right)));

            int windowSize = length-maxFreq;

            if(windowSize>k && left<=right){
                Character leftSide = s.charAt(left);
                map.put(leftSide,map.get(leftSide)-1);
                left++;
            }
            result = Math.max(result,right-left+1);
        }
        return result;
    }
}
