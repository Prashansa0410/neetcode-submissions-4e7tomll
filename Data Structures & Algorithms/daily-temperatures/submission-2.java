class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] output = new int[temperatures.length];
        for(int i=0;i<temperatures.length-1;i++){
            for(int j=i+1;j<temperatures.length;j++){
                if(temperatures[j]>temperatures[i]){
                    output[i]=j-i;
                    break;
                }
            }
        }
        return output;
    }
}
