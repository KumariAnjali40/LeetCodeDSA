class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int [][] directions = {{0,-1}, {1,0}, {0,1}, {-1,0}};
        int minutes = 0;

        Queue<int []> q = new LinkedList<>();

        int fresh = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 2){
                    q.offer(new int [] {i, j});
                } else if (grid[i][j] == 1){
                    fresh++;
                }
            }
        }

        if(fresh == 0) return 0;


        while(!q.isEmpty()){
            int size = q.size();
            
            boolean isNowRotten = false;

            for(int i = 0; i < size; i++){
                int [] curr = q.poll();

                for(int [] dir : directions){
                    int nr = curr[0] + dir[0];
                    int nc = curr[1] + dir[1];

                    if(nr >= 0 && nc >= 0 && nr < n && nc < m && grid[nr][nc] == 1){
                        grid[nr][nc] = 2;

                        q.offer(new int [] {nr, nc});
                        fresh--;
                        isNowRotten = true;

                    }
                }
            }

            if(isNowRotten) minutes++;
        }

        return fresh == 0 ? minutes : -1;

       
    }
}