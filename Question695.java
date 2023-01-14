/*      695. Max Area of Island
You are given an m x n binary matrix grid. An island is a group of 1's (representing land) connected 4-directionally (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.

The area of an island is the number of cells with a value 1 in the island.

Return the maximum area of an island in grid. If there is no island, return 0.

Example 1:

Input: grid = [[0,0,1,0,0,0,0,1,0,0,0,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,1,1,0,1,0,0,0,0,0,0,0,0],[0,1,0,0,1,1,0,0,1,0,1,0,0],[0,1,0,0,1,1,0,0,1,1,1,0,0],[0,0,0,0,0,0,0,0,0,0,1,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,0,0,0,0,0,0,1,1,0,0,0,0]]
Output: 6
Explanation: The answer is not 11, because the island must be connected 4-directionally.

Example 2:

Input: grid = [[0,0,0,0,0,0,0,0]]
Output: 0
 
Constraints:
m == grid.length
n == grid[i].length
1 <= m, n <= 50             
grid[i][j] is either 0 or 1.            */

import java.util.*;

//leetcode solution
class Solution 
{
    public int maxAreaOfIsland(int[][] grid) 
    {
          // Code here    
        int row=grid.length;
        if( row==0 )
            return 0;
        int col=grid[0].length;
        int maxArea=0;
        for( int i=0 ; i<row ; i++ )
            for( int j=0 ; j<col ; j++ )
                if( grid[i][j]==1 )
                    maxArea=Math.max( maxArea, dfs( grid, i, j, row, col ));
        
        return maxArea;
    }
    public int dfs( int grid[][], int x, int y, int row, int col )
    {   
        if( x<0 || x>=row || y<0 || y>=col || grid[x][y]<1 )
            return 0;

        grid[x][y]=0;
        
        return 1+dfs( grid, x-1, y, row, col )+dfs( grid, x+1, y, row, col )+
        dfs( grid, x, y+1, row, col )+dfs( grid, x, y-1, row, col );  
    }
}

//main method for drive the solution
class Question695
{
    public static void main(String[] args)
    {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        while( t-->0 )
        {
            int n = Sc.nextInt();
            int m = Sc.nextInt();
            int[][] grid = new int[n][m];

            for(int i = 0; i < n; i++)
                for(int j = 0; j < m; j++)
                    grid[i][j] = Sc.nextInt();
            
            Solution obj = new Solution();
            int maxArea = obj.maxAreaOfIsland( grid);
            System.out.println( maxArea );
        }
    }
}