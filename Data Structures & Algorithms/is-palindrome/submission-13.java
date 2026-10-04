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
        return (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9');
    }
}
