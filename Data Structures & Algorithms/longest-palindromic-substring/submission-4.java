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

    public boolean verifySubstringPallindrome(String s){
        int n=s.length();
        int mid=n/2;
        int j,i;
        if(n%2==0){
            j=mid;i=mid-1;
        }
        else{
            j=mid+1;i=mid-1;
        }
            while(j<n && i>=0){
                if(s.charAt(j)!=s.charAt(i)){
                    return false;
                }
                else {
                    j++;i--;
                }
            }
            return true;
        }
    }

