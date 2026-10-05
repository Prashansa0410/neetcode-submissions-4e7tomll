class Solution {
    public int characterReplacement(String s, int k) {
        //Variable window
        //keep a track of max Freq in a window - eg- 5-4=1
        //condition 1<=k - True
        //Track size of window -max is ans
        HashMap<Character,Integer> map = new HashMap<>();

        int left=0;
        int maxf=0;
        int max=0;
        for(int right =0;right<s.length();right++){
            char ch = s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            maxf= Math.max(maxf,map.get(ch));
            int windowSize = right-left+1;

            //condition for invalidity
            if(windowSize-maxf>k){
                char char1=s.charAt(left);
                map.put(char1,map.get(char1)-1);
                if(map.get(char1)==0){
                    map.remove(char1);
                }
                left++;
            }

            max=Math.max(max,right-left+1);

        }
        return max;
        
    }
}
