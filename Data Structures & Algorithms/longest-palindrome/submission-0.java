class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> seen = new HashSet<>();
        int res = 0;

        for(char ch:s.toCharArray()){
            if(seen.contains(ch)){
                seen.remove(ch);
                res=res+2;
            }
            else{
                seen.add(ch);
            }
        }
        return seen.isEmpty()?res:res+1;
        
    }
}