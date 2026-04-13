class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0,j=0,k=0;
        char[] s= new char[word1.length()+word2.length()];
        while(i<word1.length() || j<word2.length()){
            if(i<word1.length()){
                s[k++]=word1.charAt(i);
                i++;
            }
            if(j<word2.length()){
                s[k++]=word2.charAt(j);
                j++;
            }

        }
        return String.valueOf(s);
    }
}