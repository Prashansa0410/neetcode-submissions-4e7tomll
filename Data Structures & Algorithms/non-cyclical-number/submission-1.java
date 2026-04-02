class Solution {
    public boolean isHappy(int n) {
       HashSet<Integer> visit = new HashSet<>();
       while(!visit.contains(n)){
        visit.add(n);
        n=helper(n);
        if(n==1){
            return true;
        }
       }
       return false;
        
    }

    public int helper(int n){
        int sum=0;
        while(n>0){
            int digit = n%10;
            sum = sum+digit*digit;
            n=n/10;
        }
         return sum;
    }
}
