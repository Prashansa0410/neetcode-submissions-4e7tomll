class Solution {
    private static final int[][] directions={{0,-1},{-1,0},{0,1},{1,0}};
    public int numIslands(char[][] grid) {
        int ROWS=grid.length,COLS=grid[0].length;
        int count=0;

        for(int i=0;i<ROWS;i++){
            for(int j=0;j<COLS;j++){
                if(grid[i][j]=='1'){
                    bfs(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }

    public void bfs(char[][] grid,int r,int c){
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{r,c});
        grid[r][c]='0';

        while(!queue.isEmpty()){
            int[] node = new int[2];
            node = queue.poll();
            int row =node[0],col=node[1];
            for(int[] direction:directions){
                int nr=row+direction[0],nc=col+direction[1];
                if(nr>=0 && nc>=0 && nr<grid.length && nc<grid[0].length && grid[nr][nc]=='1'){
                    queue.add(new int[]{nr,nc});
                    grid[nr][nc]='0';
                }
            }
        }
    }
}
