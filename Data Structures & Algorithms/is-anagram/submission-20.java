class Solution {
    public boolean isAnagram(String s, String t) {
     int[] count = new int[26];
     for(int num:count){
        for(char ch:s.toCharArray()){
            count[ch-'a']++;
        }
        for(char ch:t.toCharArray()){
            count[ch-'a']--;
        }

        if(num!=0){
            return false;
        }
     }
     return true;
     

    }
}
