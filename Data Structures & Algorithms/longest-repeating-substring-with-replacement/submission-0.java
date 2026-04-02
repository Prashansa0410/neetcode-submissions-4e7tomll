
class Solution {
    public int characterReplacement(String s, int k) {
    Map<Character,Integer> count = new HashMap<>();
    int result=0;
    int left=0;
    int maxFreq=0;
    int length=0;
    Character maxC;

    for(int right=0;right<s.length();right++){
        //get the character and put it in map with it's frequency
        Character ch = s.charAt(right);
        count.put(ch,count.getOrDefault(ch,0)+1);
        int freq= count.get(ch);

        //Get the maxFreq 
        maxFreq=Math.max(maxFreq,count.get(ch));
        //current windowSize
        length = right-left+1;

        
        
        if(length-maxFreq>k && left<=right){
            Character leftSide = s.charAt(left);
            count.put(leftSide,count.get(leftSide)-1);
            left++;
            
        }
            result = Math.max(result, right - left + 1);
    }
    return result;
    }
}
