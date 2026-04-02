class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[] box = new HashSet[9];

        for(int i=0;i<board.length;i++){
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            box[i] = new HashSet<>();
        }

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char character = board[i][j];

                if(character=='.'){
                    continue;
                }

                if(rows[i].contains(character)){
                return false;
                }
                rows[i].add(character);

                if(cols[j].contains(character)){
                return false;
                }
                cols[j].add(character);

                int boxIndex = i/3*3+j/3;

                if(box[boxIndex].contains(character)){
                    return false;
                }
                    box[boxIndex].add(character);
                }
            }
                 return true;
        }
   
     
    }
