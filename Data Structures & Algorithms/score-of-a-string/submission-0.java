class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        for(int i=1;i<s.length();i++){
            int val='a'-s.charAt(i);
            int val1='a'-s.charAt(i-1);
            sum=sum+Math.abs(val1-val);
            
            
        }
        return sum;
    }
}