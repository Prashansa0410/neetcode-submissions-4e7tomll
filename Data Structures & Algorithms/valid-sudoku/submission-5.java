class Solution {
    public boolean isValidSudoku(char[][] board) {
       Set<Character>[] row = new HashSet[9];
       Set<Character>[] col = new HashSet[9];
       Set<Character>[] box = new HashSet[9];

       for(int i=0;i<9;i++){
        row[i]=new HashSet<>();
        col[i] = new HashSet<>();
        box[i] = new HashSet<>();
       }

       for(int i=0;i<9;i++){
        for(int j=0;j<9;j++){
            char c = board[i][j];
            if(c==('.')) continue;

            if(row[i].contains(c)){
                return false;
            }
            row[i].add(c);

            if(col[j].contains(c)){
                return false;
            }
            col[j].add(c);

            int boxIndex = i/3*3+j/3;

            if(box[boxIndex].contains(c)){
                return false;
            }
            box[boxIndex].add(c);
        }
       }
       return true;
        }
   
     
    }
