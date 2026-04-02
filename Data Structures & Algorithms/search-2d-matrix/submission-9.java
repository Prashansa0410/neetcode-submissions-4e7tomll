class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      int ROWS = matrix.length;
      int COLS = matrix[0].length;
      int targetRow =-1;

      int top=0;
      int bottom = ROWS-1;

      while(top<=bottom){
        int row = top+(bottom-top)/2;
        if(target>matrix[row][COLS-1]){
            top = row+1;
        }
        else if(target<matrix[row][0]){
            bottom=row-1;
        }
        else {
            targetRow=row;
            break;
        }
      }

      if(targetRow==-1){
        return false;
      }

      int start=0, end=COLS-1;
      while(start<=end){
        int mid = start+(end-start)/2;
        if(matrix[targetRow][mid]==target){
            return true;
        }
        else if(target<matrix[targetRow][mid]){
            end=mid-1;
        }
        else {
            start=mid+1;
        }
      }
      return false;

    }
}
             
   
