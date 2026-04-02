class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[] box = new HashSet[9];

        for(int i=0;i<9;i++){
        rows[i] = new HashSet<>();
        cols[i] = new HashSet<>();
        box[i] = new HashSet<>();
        }

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char ch = board[i][j];
                if(ch=='.'){
                    continue;
                }

                if(rows[i].contains(ch)){
                 return false;
                }
                rows[i].add(ch);

                if(cols[j].contains(ch)){
                    return false;
                }
                cols[j].add(ch);

                int boxIndex= i/3*3+j/3;
                if(box[boxIndex].contains(ch)){
                    return false;
                }
                box[boxIndex].add(ch);
            }
        }
        return true;
        }
   
     
    }
