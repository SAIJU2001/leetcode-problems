/*          994. Rotting Oranges
You are given an m x n grid where each cell can have one of three values:

0 representing an empty cell,
1 representing a fresh orange, or
2 representing a rotten orange.
Every minute, any fresh orange that is 4-directionally adjacent to a rotten orange becomes rotten.

Return the minimum number of minutes that must elapse until no cell has a fresh orange. If this is impossible, return -1.

Example 1:
Input: grid = [[2,1,1],[1,1,0],[0,1,1]]
Output: 4

Example 2:
Input: grid = [[2,1,1],[0,1,1],[1,0,1]]
Output: -1
Explanation: The orange in the bottom left corner (row 2, column 0) is never rotten, because rotting only happens 4-directionally.

Example 3:
Input: grid = [[0,2]]
Output: 0
Explanation: Since there are already no fresh oranges at minute 0, the answer is just 0.
 
Constraints:
m == grid.length
n == grid[i].length
1 <= m, n <= 10
grid[i][j] is 0, 1, or 2.               */

import java.util.*;
import java.lang.*;
import java.io.*;

//solution for leetcode
class Solution 
{
    public int orangesRotting(int[][] grid) 
    {
        //- Initial Fresh Oranges
        int countFresh=0;
        //- If nothing is there
        if ( grid==null||grid.length==0 )
        {
            return 0;
        }
        int row= grid.length;
        int col=grid[0].length;
        Queue<int[]> q=new LinkedList<>();
        //- Now we will put all the rotten oranges in que
        //- And Count No. of  Fresh Oranges
        for (int i = 0; i < row; i++) 
            for (int j = 0; j <col ; j++) 
            {
                if (grid[i][j]==2)
                    q.offer(new int[]{i,j});

                if (grid[i][j]!=0)
                    countFresh++;
            }
        //Since there are already no fresh oranges at minute 0, the answer is just 0.
        if (countFresh==0)
            return 0;
        //It count the minutes
        int countMin=0;
        //It Count the total no values in que that have been rotted
        int cnt=0;
        //For Movement (L,R,D,U)
        int []dx={0,0,1,-1};
        int []dy={1,-1,0,0};

        //BFS starting from initially rotten oranges
        while ( !q.isEmpty() )
        {
            int size=q.size();
            cnt+=size;
            for (int i = 0; i < size; i++) 
            {
                int [] point=q.poll();
                for (int j = 0; j <4 ; j++) 
                {
                    int x=point[0]+dx[j];
                    int y=point[1]+dy[j];

                    if (x<0 || y<0 || x>=row || y>=col || grid[x][y]==0 || grid[x][y]==2)
                        continue;
            
                    // -Updating the values since they also Became Rotten
                    grid[x][y]=2;
                    q.offer(new int[]{x,y});
                }
            }
            if (q.size()!=0)
                countMin++;
        }
        return countFresh == cnt ? countMin : -1;
    }
}
 
//for drive the solution main class 
class  Question994
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] grid = new int[n][m];
            for(int i = 0; i < n; i++)
            {
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++)
                {
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            int ans = obj.orangesRotting(grid);
            System.out.println(ans);
        }
    }
}