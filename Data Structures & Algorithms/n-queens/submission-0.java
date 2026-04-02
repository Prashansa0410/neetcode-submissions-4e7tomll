class Solution {
    public List<List<String>> solveNQueens(int n) {
        //initialization

        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] ='.';
            }
        }
         backtrack(0,board,res);
         return res;
    }

    public void backtrack(int row,char[][] board,List<List<String>> res){
        List<String> copy = new ArrayList<>();
        if(row==board.length){
           for(char[] ch:board){
            copy.add(new String(ch));
           }
           res.add(copy);
        }

for(int col=0;col<board.length;col++){
        if(isSafe(row,col,board)){
            board[row][col]='Q';
            backtrack(row+1,board,res);
            board[row][col]='.';
        }
}
}

    private Boolean isSafe(int row, int col, char[][] board) {
    // Vertical 
    for (int i = 0; i < row; i++) {  
        if (board[i][col] == 'Q') return false;
    }

    // Left Diagonal 
    for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
        if (board[i][j] == 'Q') return false;
    }

    // Right Diagonal
    for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
        if (board[i][j] == 'Q') return false;
    }

    return true;
}
}
