class Solution {
    public int[] replaceElements(int[] arr) {
       Stack<Integer> stack = new Stack<>();
       int[] newArry = new int[arr.length];
       int max=0;
       int n =arr.length;
       newArry[n-1]=-1;
       for(int i=n-2;i>=0;i--){
        
        if(max<arr[i+1]){
            max=arr[i+1];
        }
        newArry[i]=max;
        if(i==0){
            break;
        }
       }
       return newArry;
    }
}