class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int ROWS = heights.length,COLS=heights[0].length;
        boolean[][] pac = new boolean[ROWS][COLS];
        boolean[][] atl = new boolean[ROWS][COLS];
        List<List<Integer>> result = new ArrayList<>();
        for(int c=0;c<COLS;c++){
            dfs(0,c,pac,heights,heights[0][c]);
            dfs(ROWS-1,c,atl,heights,heights[ROWS-1][c]);
        }

        for(int r=0;r<ROWS;r++){
            dfs(r,0,pac,heights,heights[r][0]);
            dfs(r,COLS-1,atl,heights,heights[r][COLS-1]);
        }

        for(int r=0;r<ROWS;r++){
            for(int c=0;c<COLS;c++){
                if(pac[r][c] && atl[r][c]){
                    result.add(Arrays.asList(r,c));
                }
            }
        }
        return result;
    }

    public void dfs(int r,int c,boolean[][] visited,int[][] heights,int prevHeight){
        if(r<0 || c<0 || r>=heights.length || c>=heights[0].length){
            return;
        }

        if(visited[r][c] || heights[r][c]<prevHeight){
            return;
        }
        visited[r][c] =true;
         
        dfs(r-1,c,visited,heights,heights[r][c]);
        dfs(r+1,c,visited,heights,heights[r][c]);
        dfs(r,c-1,visited,heights,heights[r][c]);
        dfs(r,c+1,visited,heights,heights[r][c]);


    }
}
