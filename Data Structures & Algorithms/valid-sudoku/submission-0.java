class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] row = new HashSet[9];
        Set<Character>[] col = new HashSet[9];
        Set<Character>[] boxIndex = new HashSet[9];
        for(int i=0;i<9;i++){
            row[i] = new HashSet<>();
            col[i] = new HashSet<>();
            boxIndex[i] = new HashSet<>();
        }

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                Character num= board[i][j];
                if(num=='.') continue;

                if(row[i].contains(num))
                return false;
                row[i].add(num);

                if(col[j].contains(num))
                return false;
                col[j].add(num);

                int index = (i/3)*3+j/3;
                if(boxIndex[index].contains(num))
                return false;
                boxIndex[index].add(num);  
                
            }
            
        }

         return true;
    }
}
