class Solution {
    public String longestPalindrome(String s) {
        String longString="";
        int maxLength=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String subs = s.substring(i,j+1);
                boolean value=verifySubstringPallindrome(subs);
                if(value){
                    int length = j-i+1;
                    if(length>maxLength){
                         longString=subs;
                         maxLength=length;
                    }
                }
            }
        }
        return longString;
    }

    public boolean verifySubstringPallindrome(String str){
       int n=str.length();
        int i=0, j=n-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;

    }
}
