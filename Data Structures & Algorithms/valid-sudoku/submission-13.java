class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer,HashSet<Character>> rows = new HashMap<>();
        HashMap<Integer,HashSet<Character>> cols = new HashMap<>();
        HashMap<String,HashSet<Character>> sq = new HashMap<>();

        for(int r=0;r<board.length;r++){
            for(int c=0;c<board[0].length;c++){
                if(board[r][c]=='.'){
                    continue;
                }
                String square = r/3+","+c/3 ;

                if(rows.computeIfAbsent(r,k->new HashSet<>()).contains(board[r][c])||
                cols.computeIfAbsent(c,k->new HashSet<>()).contains(board[r][c])||
                sq.computeIfAbsent(square,k->new HashSet<>()).contains(board[r][c])){
                    return false;
                }
                rows.get(r).add(board[r][c]);
                cols.get(c).add(board[r][c]);
                sq.get(square).add(board[r][c]);

            }

        }
        return true;
    }
        }
        
