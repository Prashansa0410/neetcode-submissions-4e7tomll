class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //Now use Binary Search

        int top=0,bottom=matrix.length-1;
        int targetRow =-1;
        int ROWS=matrix.length;
        int COLS = matrix[0].length;
        while(top<=bottom){
            int row=top+(bottom-top)/2;
            if(matrix[row][COLS-1]<target){
                top=row+1;
            }
            else if(matrix[row][0]>target){
                bottom=row-1;
            }
            else{
                targetRow=row;
                break;
            }
        }

        if(targetRow==-1){
            return false;
        }

        int left=0,right=COLS-1;
        while(left<=right){
            int middle = left+(right-left)/2;
            if(matrix[targetRow][middle]==target){
                return true;
            }
            else if(matrix[targetRow][middle]>target){
                right=middle-1;
            }
            else{
                left=middle+1;
            }
        }
        return false;

    }
}
