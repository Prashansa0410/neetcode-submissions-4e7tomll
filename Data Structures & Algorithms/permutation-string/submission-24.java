class Solution {
    public boolean checkInclusion(String s1, String s2) {
       //sliding window fixed pattern
       if(s1.length()>s2.length()) {
        return false;
       }
        
        int[] counts1=new int[26];
        int[] counts2=new int[26];

        for(int i=0;i<s1.length();i++){
            counts1[s1.charAt(i)-'a']++;
            counts2[s2.charAt(i)-'a']++;
        }

        if(Arrays.equals(counts1,counts2)){
            return true;
        }
        int k=s1.length();

        for(int j=k;j<s2.length();j++){
            counts2[s2.charAt(j)-'a']++;
            counts2[s2.charAt(j-k)-'a']--;

            if(Arrays.equals(counts1,counts2)){
                return true;
            }
        }
        return false;
    }
}
