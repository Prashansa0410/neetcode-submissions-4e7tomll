class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        int[][] car = new int[position.length][2];
        for(int i=0;i<position.length;i++){
            car[i][0]=position[i];
            car[i][1]=speed[i];
        }
        double maxTimeSeen=0;
        int fleet=0;

        //sorting in asecnding order
        Arrays.sort(car,(a,b)->Integer.compare(a[0],b[0]));

        for(int j=position.length-1;j>=0;j--){
             double time=(double)(target-car[j][0])/car[j][1]; //10
             if(time>maxTimeSeen){
                fleet++;
                maxTimeSeen=time;
             }
        }
        return fleet;
    }
}
