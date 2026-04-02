class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int left=0;int top=0; int right=matrix[0].length;int bottom = matrix.length;
         
         while(left<right && top<bottom){
        //top layer
        for(int i=left;i<right;i++){
            list.add(matrix[top][i]);
        }
        top++;

        //right layer
        for(int i=top;i<bottom;i++){
            list.add(matrix[i][right-1]);
        }
        right--;

        if(!(left<right && top<bottom)){
            break;
        }

        //bottom layer
        for(int i=right-1;i>left;i--){
            list.add(matrix[bottom-1][i]);
        }
        bottom--;

        //left layer
        for(int i=bottom;i>=top;i--){
            list.add(matrix[i][left]);
        }
        left++;
         }

        return list;
    }
}
