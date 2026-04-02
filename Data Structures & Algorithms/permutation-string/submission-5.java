class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        char[] characters1=s1.toCharArray();
        Arrays.sort(characters1);
        s1 = new String(characters1);
        char[] characters2 = s2.toCharArray();

        for(int i=0;i<=s2.length()-s1.length();i++){
            int j=i+s1.length();
                String substr = s2.substring(i,j);
                char[] subStringChar = substr.toCharArray();
                Arrays.sort(subStringChar);
                String substring = new String(subStringChar);
                if(s1.equals(substring)){
                return true;
                }
            
        }
        
    return false;
    }
    
}
