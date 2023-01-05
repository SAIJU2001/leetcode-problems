/*      566. Reshape the Matrix
In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one with a different size r x c keeping its original data.

You are given an m x n matrix mat and two integers r and c representing the number of rows and the number of columns of the wanted reshaped matrix.

The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.

If the reshape operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.

Example 1:
Input: mat = [[1,2],[3,4]], r = 1, c = 4
Output: [[1,2,3,4]]

Example 2:
Input: mat = [[1,2],[3,4]], r = 2, c = 4
Output: [[1,2],[3,4]]
 
Constraints:
m == mat.length
n == mat[i].length
1 <= m, n <= 100
-1000 <= mat[i][j] <= 1000
1 <= r, c <= 300                */

import java.util.*;

//leetcode solution
class Solution 
{
    public int[][] matrixReshape(int[][] mat, int r, int c) 
    {
      
    //approach 1

     /*   int update[][]=new int[r][c];
        int m=mat.length;
        int n=mat[0].length;
        int extra[]=new int[m*n];
        
        if(( m*n>r*c) || (m*n<r*c) )
            return mat;
        int index=0;
        for( int i=0 ; i<m ; i++ )
            for( int j=0 ; j<n ; j++ )
                extra[index++]=mat[i][j];

        index=0;
        for( int i=0 ; i<r ; i++ )
            for( int j=0 ; j<c ; j++ )
                update[i][j]=extra[index++];

        return update;
        */

    //approach 2
        int m=mat.length;
        int n=mat[0].length;
        int totalSize=m*n;
        if( totalSize!=r*c )
            return mat;
         int update[][]=new int[r][c];
         for( int i=0 ; i<totalSize ; i++ )
            update[i/c][i%c]=mat[i/n][i%n];
        
        return update;
    }
}

//main class for drive the solution
public class Question566
{
    public static void main(String args[]) 
    {
        Scanner Sc=new Scanner(System.in);
        int t=Sc.nextInt();
        while( t-->0 )
        {
            int m=Sc.nextInt();
            int n=Sc.nextInt();
            int mat[][]=new int[m][n];
            for( int i=0 ; i<m ; i++ )
                for( int j=0 ; j<n ; j++ )
                    mat[i][j]=Sc.nextInt();

            int r=Sc.nextInt();
            int c=Sc.nextInt();
            Solution sl=new Solution();
            int matrix[][]=sl.matrixReshape( mat, r, c);

            for( int i=0 ; i<matrix.length ; i++ )
            {
                for( int j=0 ; j<matrix[0].length ; j++ )
                    System.out.print(matrix[i][j]+" ");
                System.out.println();
            }
        }   
    }
}