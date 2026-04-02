class Solution {
    public boolean isPalindrome(String s) {
        int l=0, r= s.length()-1;
        
        while(l<r){
            while(l<r && !alphanum(s.charAt(l))){
                l++;
            }
            while(r>l && !alphanum(s.charAt(r))){
                r--;
            }
            if(Character.toLowerCase(s.charAt(l))!=Character.toLowerCase(s.charAt(r))){
                return false;
            }
            l++;r--;
        }
        return true;

    }

    public boolean alphanum(char ch){
        return (ch>='A' && ch<='Z'||
           ch>='a' && ch<='z'||
           ch>='0' && ch<='9');
    }
}
