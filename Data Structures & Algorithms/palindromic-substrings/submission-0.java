class Solution {
    public int countSubstrings(String s) {
        int countString=0;
        int resLength=0;int rIndex=0;int n=s.length();
        for(int i=0;i<s.length();i++){
        //odd length;
        int l=i;int r=i;
        while(l>=0 && r<n && s.charAt(l)==s.charAt(r)){
            countString=countString+1;
            l--;r++;
        }
        l=i;r=i+1;
        while(l>=0 && r<n && s.charAt(l)==s.charAt(r)){
            countString=countString+1;
            l--;r++;
        }
      }
      return countString;
    }
}
