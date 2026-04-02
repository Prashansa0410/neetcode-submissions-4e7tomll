class Solution {
    public boolean isPalindrome(String s) {
        
        String t= s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        StringBuilder build = new StringBuilder(t);
        String reverse = build.reverse().toString();
        if(reverse.equals(t)){
            return true;
        }
        return false;
        
    }
}
