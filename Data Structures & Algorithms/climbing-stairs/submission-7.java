class Solution {
    public int climbStairs(int n) {
       int one=1,two=one;

       for(int i=0;i<n-1;i++){
        int temp =one;
        one = one +two;
        two=temp;
       }
       return one;
    }
}
