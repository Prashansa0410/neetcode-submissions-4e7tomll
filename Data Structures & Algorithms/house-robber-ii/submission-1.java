class Solution {
    public int rob(int[] nums) {
        
       int n=nums.length;
        if(n<2){
            return nums[0];
        }
       int[] maxHouse1 = new int[n-1];
       int[] maxHouse2 = new int[n-1];

       for(int i=0;i<n-1;i++){
        maxHouse1[i]=nums[i];
        maxHouse2[i]=nums[i+1];
       }
       int house1=maxHouse(maxHouse1);
       int house2=maxHouse(maxHouse2);
       return Math.max(house1,house2);
    }

    public int maxHouse(int[] num){
        int n =num.length;
        int[] value=new int[n];
        if(n<2){
            
            return num[0];
        }
        value[0]=num[0];
        value[1]=Math.max(num[0],num[1]);

        for(int i=2;i<n;i++){
            value[i]=Math.max(num[i]+value[i-2],value[i-1]);
        }
        return value[n-1];

    }
}
