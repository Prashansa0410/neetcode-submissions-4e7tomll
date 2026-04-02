class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
         int n= position.length;
         if(n==0){
            return 0;
        }
        int[][] car = new int[n][2];

        //Store the pairs of position and speed in 2d array
        for(int i=0;i<n;i++){
            car[i][0]=position[i];
            car[i][1]=speed[i];
        }
        Arrays.sort(car,(a,b)->Integer.compare(b[0],a[0]));

        //int[] time = new int[n];
        double prevTime = (double)(target-car[0][0])/car[0][1];
        int fleet=1;
        for(int i=1;i<n;i++){
            double currentTime= (double)(target-car[i][0])/car[i][1];
            if(prevTime<currentTime){
                fleet++;
                prevTime=currentTime;
            } 
        }
        return fleet;
    }
}
