class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        char[] c1 = s1.toCharArray();
        Arrays.sort(c1);
        s1= new String(c1);

        for(int i=0;i<=s2.length()-s1.length();i++){
            int j=i+s1.length();
            String substring = s2.substring(i,j);
            char[] subs = substring.toCharArray();
            Arrays.sort(subs);
            substring = new String(subs);
            if(s1.equals(substring)){
                return true;
            }
        }
        return false;
    }
    
}
