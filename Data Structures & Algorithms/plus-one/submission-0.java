class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]=digits[i]+1;   
                return digits;
            }
            digits[i]=0;
        }
            int[] newDigit= new int[digits.length+1];
            newDigit[0]=1;
            for(int i=1;i<newDigit.length;i++){
                newDigit[i]=digits[i-1];
            }
            return newDigit;
            
    }
}
