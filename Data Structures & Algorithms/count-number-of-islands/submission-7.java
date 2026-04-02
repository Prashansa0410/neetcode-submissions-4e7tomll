class Solution {
    private static int[][] directions= {{0,-1},{-1,0},{0,1},{1,0}};
    public int numIslands(char[][] grid) {
        int islands=0;

        int ROWS = grid.length,COLS=grid[0].length;
        for(int r=0;r<ROWS;r++){
            for(int c=0;c<COLS;c++){
                if(grid[r][c]=='1'){
                    bfs(grid,r,c);
                    islands++;
                }
            }    
        }
        return islands;     
    }

    public void bfs(char[][] grid, int row, int col){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{row,col});
        grid[row][col]='0';
        while(!queue.isEmpty()){
            int[] num=queue.poll();
            int r=num[0],c=num[1];
           for(int[] dir:directions){
            int nr = dir[0]+r,nc =dir[1]+c;
            if(nr>=0 && nc>=0 && nc<grid[0].length && nr<grid.length && grid[nr][nc]=='1'){
                queue.add(new int[]{nr,nc});
                grid[nr][nc]='0';
            }
           }

        }
    }
}
