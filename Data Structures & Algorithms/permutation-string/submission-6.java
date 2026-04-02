class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] ch1 = s1.toCharArray();
        Arrays.sort(ch1);
        s1 = new String(ch1);

        for(int i=0;i<=s2.length()-s1.length();i++){
            int j=i+s1.length();
            String substring = s2.substring(i,j);
            char[] characterSubstring = substring.toCharArray();
            Arrays.sort(characterSubstring);
            substring = new String(characterSubstring);
            if(s1.equals(substring)){
                return true;
            }
            
            
        }
        return false;
    }
    
}
