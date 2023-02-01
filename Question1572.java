/*              1572. Matrix Diagonal Sum

Given a square matrix mat, return the sum of the matrix diagonals.

Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.

Example 1:
Input: mat = [[1,2,3],
              [4,5,6],
              [7,8,9]]
Output: 25
Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
Notice that element mat[1][1] = 5 is counted only once.

Example 2:
Input: mat = [[1,1,1,1],
              [1,1,1,1],
              [1,1,1,1],
              [1,1,1,1]]
Output: 8

Example 3:
Input: mat = [[5]]
Output: 5
 
Constraints:
n == mat.length == mat[i].length
1 <= n <= 100
1 <= mat[i][j] <= 100                   */


import java.util.*;

//leetcode solution
class Solution 
{
    public int diagonalSum(int[][] mat) 
    {
      //approach 1

    /*    int i=0,j=0,sum1=0,sum2=0;
        int row=mat.length-1,col=mat[0].length-1;

        while( i<=row && j<=col )
            sum1+=mat[i++][j++];

        j=0;
        while( row>=0 && j<=col )
            sum1+=mat[row--][j++];
        
        if( mat.length%2!=0 )
            return sum1+sum2-mat[mat.length/2][mat[0].length/2];
        else
            return sum1+sum2;

        */

        //Approach 2

        int n=mat.length,result=0;
        for( int i=0 ; i<n ; i++ )
            result+=mat[n-i-1][i]+mat[i][i];

        if( mat.length%2!=0 )
            return result-mat[n/2][n/2];
        else
            return result;
    }
}

//main class for drive the solution
public class Question1572
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int t=Sc.nextInt();
        while( t-->0 )
        {
            int row=Sc.nextInt();
            int col=Sc.nextInt();
            int mat[][]=new int[row][col];

            for( int i=0 ; i<row ; i++ )
                for( int j=0 ; j<col ; j++ )
                    mat[i][j]=Sc.nextInt();
                    
            Solution sl=new Solution();
            System.out.print( sl.diagonalSum( mat) );
        }
    }
}