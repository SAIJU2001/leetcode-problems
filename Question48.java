/*          48. Rotate Image

You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

Example 1:
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]

Example 2:
Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
 
Constraints:
n == matrix.length == matrix[i].length
1 <= n <= 20
-1000 <= matrix[i][j] <= 1000               */


import java.io.*;
import java.util.*;

//solution for leetcode
class Solution 
{
    public void rotate(int[][] matrix) 
    {
        int row=matrix.length,col=matrix[0].length,temp=0;
        //transpose the matrix
        for( int i=0 ; i<row ; i++ )
            for( int j=i ; j<col ; j++ )
            {
                temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }

        //reverse the every row
        for( int i=0 ; i<row ; i++ )
            for( int j=0 ; j<col/2 ; j++ )
            {
                temp=matrix[i][j];
                matrix[i][j]=matrix[i][col-j-1];
                matrix[i][col-j-1]=temp;
            }
    }
}


//main class for drive the solution
class Question48
{
    public static void main(String args[])
    {
        Scanner Sc= new Scanner(System.in);
        int t=Sc.nextInt();
        
        while(t-- > 0)
        {
            int n = Sc.nextInt();
            int matrix[][] = new int[n][n];
            for( int i=0 ; i<n ; i++ )
                for( int j=0 ; j<n ; j++ )
                    matrix[i][j] =Sc.nextInt();
            System.out.println();

            Solution ob = new Solution();
            ob.rotate( matrix);

            for( int i=0 ; i<n ; i++ )
            {
                for( int j=0 ; j<n ; j++ )
                    System.out.print(matrix[i][j] + " ");
            
                System.out.println();
            }
        }
    }
}