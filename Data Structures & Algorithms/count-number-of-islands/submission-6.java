class Solution {
    private static int[][] directions= {{0,-1},{-1,0},{0,1},{1,0}};
    public int numIslands(char[][] grid) {
        int islands=0;
        int ROWS=grid.length,COLS=grid[0].length;
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

    public void bfs(char[][] grid,int r,int c){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{r,c});
        grid[r][c]='0';
        while(!queue.isEmpty()){
        int[] num = queue.poll();
        int row = num[0],col=num[1];

        for(int[] dir:directions){
            int nr =row+dir[0],nc= col+dir[1];
            if(nr>=0 && nc>=0 && nr<grid.length && nc<grid[0].length && grid[nr][nc]=='1'){
                queue.add(new int[]{nr,nc});
                grid[nr][nc]='0';
            }
        }
        }
    }
}
