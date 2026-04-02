class Solution {
    public boolean isPalindrome(String s) {
        String t=s.toLowerCase().replaceAll("[^a-z0-9]","");
        String reverseString = new StringBuilder(t).reverse().toString();
        Boolean compareString = t.equals(reverseString);
        return compareString;
    }
}
