class Solution {
    public int[] sortArray(int[] nums) {
        return quickSort(0,nums.length-1,nums);
        
    }

    public int[] quickSort(int low,int high,int[] array){
        if(low<high){
        int p1=partition(low,high,array);
        quickSort(low,p1-1,array);
        quickSort(p1+1,high,array);
        
        }
        return array;
    }

    public int partition(int low,int high,int[] array){
        int pivot = array[high];
        int index=low-1;
         for(int j=low;j<high;j++){
            if(array[j]<=pivot){
                index++;
                int temp=array[j];
                array[j]=array[index];
                array[index]=temp;
            }
         } 
         int temp=array[index+1];
         array[index+1]=array[high];
         array[high]=temp;
         return index+1;
    }


}