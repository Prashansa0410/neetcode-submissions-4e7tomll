class Solution {
     int[] count = new int[26];
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
       
       for(char ch:s.toCharArray()){
        count[ch-'a']++;
       }
       for(char ch:t.toCharArray()){
        count[ch-'a']--;
       }

       for(int num: count){
        if(num!=0){
            return false;
        }
       }
       return true;

    }
}
