package com.peter12.solution.medium;

public class MEDIUM_0200_NUMBER_OF_ISLANDS {
	public int numIslands(char[][] grid) {
        /*
          Solution: https://www.cnblogs.com/grandyang/p/4402656.html
        */
        boolean[][] visited = new boolean[grid.length][];
        for( int i = 0; i < visited.length; i++ ) {
            visited[i] = new boolean[grid[i].length];
        }
        
        int result = 0;
        for( int i = 0; i < grid.length; i++ ) {
            for( int j = 0; j < grid[i].length; j++ ) {
                if( visited[i][j] == false && grid[i][j] == '1') {
                    dfs( i, j, visited, grid);
                    
                    result++;
                }
            }
        }
        
        return result;
    }
    
    public void dfs( int x, int y, boolean[][] visited, char[][] grid ) {
        if( visited[x][y] == true || grid[x][y] == '0' ) {
            return;
        }
        
        visited[x][y] = true;
        if( x - 1 >= 0 ) {
            dfs( x - 1, y, visited, grid);
        }
        
        if( x + 1 < grid.length ) {
            dfs( x + 1, y, visited, grid);
        }
        
        if( y - 1 >= 0 ) {
            dfs(x , y - 1, visited, grid);
        }
        
        if( y + 1 < grid[x].length ) {
            dfs(x, y + 1, visited, grid);
        }
        
        
    }
}
