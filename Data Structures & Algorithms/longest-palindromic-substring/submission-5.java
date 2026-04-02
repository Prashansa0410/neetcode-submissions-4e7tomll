class Solution {
    public String longestPalindrome(String s) {
        //Here we need 2 pointer appraoch along with 1 iteration
        //check for both odd and even length pallindromes
        //You need one resLength to calculate res Length and one rIndex to find left most index
        int resLength=0;int rIndex=0;int n=s.length();
        for(int i=0;i<s.length();i++){
        //odd length;
        int l=i;int r=i;
        while(l>=0 && r<n && s.charAt(l)==s.charAt(r)){
            if(r-l+1>resLength){
                rIndex=l;
                resLength=r-l+1;
            }
            l--;r++;
        }
        l=i;r=i+1;
        while(l>=0 && r<n && s.charAt(l)==s.charAt(r)){
            if(r-l+1>resLength){
                rIndex=l;
                resLength=r-l+1;
            }
            l--;r++;
        }
      }
      return s.substring(rIndex,rIndex+resLength);
    }
}
