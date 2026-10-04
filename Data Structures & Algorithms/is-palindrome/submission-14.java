class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            while (i < j && !alphanum(s.charAt(i))) {
                i++;
            }
            while (j > i && !alphanum(s.charAt(j))) {
                j--;
            }
            if (i >= j) {
                break;
            }
            if (Character.toLowerCase(s.charAt(i)) != (Character.toLowerCase(s.charAt(j)))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public boolean alphanum(char ch) {
        return Character.isLetterOrDigit(ch);
    }
}
