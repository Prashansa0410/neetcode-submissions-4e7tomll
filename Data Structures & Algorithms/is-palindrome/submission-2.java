class Solution {
    public boolean isPalindrome(String s) {
        
        String t= s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        StringBuilder build = new StringBuilder(t);
        if(build.reverse().toString().equals(t))
        return true;
        else
        return false;
        
    }
}
