/*              542. 01 Matrix
Given an m x n binary matrix mat, return the distance of the nearest 0 for each cell.

The distance between two adjacent cells is 1.

Example 1:

Input: mat = [[0,0,0],[0,1,0],[0,0,0]]
Output: [[0,0,0],[0,1,0],[0,0,0]]

Example 2:

Input: mat = [[0,0,0],[0,1,0],[1,1,1]]
Output: [[0,0,0],[0,1,0],[1,2,1]]
 
Constraints:
m == mat.length
n == mat[i].length
1 <= m, n <= 104
1 <= m * n <= 104
mat[i][j] is either 0 or 1.
There is at least one 0 in mat.             */

import java.util.*;

//leetcode solution
class Solution 
{
    public int[][] updateMatrix(int[][] mat) 
    {
        int n=mat.length;
        int m=mat[0].length;

        int vist[][]=new int[n][m];
        int dist[][]=new int[n][m];
        Queue<Node>q=new LinkedList<>();
        for( int i=0 ; i<n ; i++ )
            for( int j=0 ; j<m ; j++ )
                if( mat[i][j]==0 )
                {
                    q.add( new Node( i,j,0 ) );
                    vist[i][j]=0; 
                }
                else
                    vist[i][j]=1;

        int delrow[]={-1,0,+1,0};
        int delcol[]={0,+1,0,-1};

        while( !q.isEmpty() )
        {
            int row=q.peek().first;
            int col=q.peek().second;
            int steps=q.peek().third;
            q.remove();
            dist[row][col]=steps;

            for( int i=0 ; i<4 ; i++ )
            {
                int nrow=row+delrow[i];
                int ncol=col+delcol[i];

                if( nrow>=0 && nrow<n && ncol>=0 && ncol<m && vist[nrow][ncol]==1 )
                {
                     vist[nrow][ncol]=0;
                    q.add(new Node( nrow,ncol,steps+1 ) );
                }
            }
        }
        return dist;
    }
}
class Node
{
    int first;
    int second;
    int third;
    Node( int _first, int _second , int _third )
    {
        this.first=_first;
        this.second=_second;
        this.third=_third;
    }
}


//for drive the solution main method
class Question542
{
    public static void main(String[] args)
    {
        Scanner Sc= new Scanner(System.in);
        int t = Sc.nextInt();
        while( t-->0 )
        {
            int n = Sc.nextInt();
            int m = Sc.nextInt();
            int[][] mat = new int[n][m];
            for( int i=0 ; i<n ; i++ )
                for( int j=0 ; j<m ; j++ )
                    mat[i][j] = Sc.nextInt();
    
            Solution obj = new Solution();
            int[][] ans = obj.updateMatrix(mat);
            for( int i=0 ; i<ans.length ; i++ )
            {
                for( int j=0 ; j<ans[i].length ; j++ )
                    System.out.print( ans[i][j] + " " );

                System.out.println();
            }
        }
    }
}