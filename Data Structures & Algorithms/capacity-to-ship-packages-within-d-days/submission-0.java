class Solution {
    public int shipWithinDays(int[] weights, int days) {
        //Binary Search
        int low=0;
        for(int weight:weights){
            low =Math.max(low,weight);
        }
        int high=0;
        for(int weight:weights){
            high=high+weight;
        }
        while(low<=high){
            int mid = low+(high-low)/2;
            int load=0;
            int ship=1;
            for(int weight:weights){
                if(load+weight>mid){
                    ship++;
                    load=0;
                }
                load=load+weight;
            }
            if(ship <= days){
               high = mid - 1;   // try smaller capacity
            } else {
            low = mid + 1;    // increase capacity
            }
        }
        return low;
    }
}