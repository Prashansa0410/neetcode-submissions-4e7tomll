class Solution {
    public boolean isPalindrome(String s) {
        int left =0;
        int right=s.length()-1;
        while(left<right){
            while(left<right && !alphanum(s.charAt(left))){
                left++;
            }
            while(right>left && !alphanum(s.charAt(right))){
                right--;
            }
            if(Character.toLowerCase(s.charAt(right))!=Character.toLowerCase(s.charAt(left)))
                return false;
                right--;
                left++;

        }
        return true;
    }

    public boolean alphanum(char ch){
        return ((ch >= 'A' && ch <='Z')||
                  (ch >= 'a' && ch <='z')||
                  (ch >= '0' && ch <='9'));
    }
}
