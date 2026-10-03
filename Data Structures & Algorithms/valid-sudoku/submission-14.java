class Solution {
    public boolean isValidSudoku(char[][] board) {
        List<Set<Character>> row = new LinkedList<>();
        List<Set<Character>> col = new LinkedList<>();
        List<Set<Character>> box = new LinkedList<>();

        for(int i=0;i<9;i++){
             row.add(new HashSet<>());   
             col.add(new HashSet<>());
             box.add(new HashSet<>());
        }

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                char character = board[i][j];
                if(character=='.'){
                    continue;
                }
            if(row.get(i).contains(character)) {
                return false;
            }
            row.get(i).add(character);

            if(col.get(j).contains(character)){
                return false;
            }
            col.get(j).add(character);

            int boxIndex = i/3*3+j/3;
            if(box.get(boxIndex).contains(character)){
                return false;
            }
            box.get(boxIndex).add(character);
            
            }
        }
        return true;
        
    }
}
