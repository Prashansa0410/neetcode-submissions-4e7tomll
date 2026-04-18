class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        char[] s1char = s1.toCharArray();
        Arrays.sort(s1char);
        String newstring =new String(s1char);
        
        for(int i=0;i<s2.length()-s1.length()+1;i++){
            String s2Substring=s2.substring(i,i+s1.length());
            char[] s2char = s2Substring.toCharArray();
            Arrays.sort(s2char);
            String sub=new String(s2char);

            if(newstring.equals(sub)){
                return true;
            }
            
        }
        return false;
        
        
    }
}
