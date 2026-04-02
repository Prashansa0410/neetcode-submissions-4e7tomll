class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int matches=0;
        if(s1.length()>s2.length()){
            return false;
        }

        int[] counts1 = new int[26];
        int[] counts2 = new int[26];

        for(int i=0;i<s1.length();i++){
            counts1[s1.charAt(i)-'a']++;
            counts2[s2.charAt(i)-'a']++;
        }

        for(int i=0;i<26;i++){
            if(counts1[i]==counts2[i]){
                matches++;
            }
        }
        
        int left=0;
        for(int i=s1.length();i<s2.length();i++){
            
            if(matches==26){
                return true;
            }

            int index = s2.charAt(i)-'a';
            counts2[index]++;

            if(counts2[index]==counts1[index]){
                matches++;
            }
            else if(counts2[index]-1==counts1[index]){
                matches--;
            }

            index = s2.charAt(left)-'a';
            counts2[index]--;

            if(counts1[index]==counts2[index]){
                matches++;
            }
            else if(counts1[index]==counts2[index]+1){
                matches--;
            }

            left++;
            
        }
        return matches==26;
    }
}
