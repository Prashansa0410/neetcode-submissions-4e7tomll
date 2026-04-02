
class Solution {
    public int characterReplacement(String s, int k) {
       Map<Character,Integer> map = new HashMap<>();

       int i=0,j=0,maxFreq=0,result=0;

       while(j<s.length()){
        char ch = s.charAt(j);
        map.put(ch,map.getOrDefault(ch,0)+1);
        maxFreq = Math.max(maxFreq,map.get(ch));

        int currentWindow = j-i+1-maxFreq; //no. of replacements allowed
        if(currentWindow<=k){
            result = Math.max(result,j-i+1);
        }
        else if(currentWindow>k){
            char c= s.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)-1);
            }
            i++;
        }
        j++;


       }
return result;
     
    }
      
}
