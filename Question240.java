/*              240. Search a 2D Matrix II
Companies
Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

Integers in each row are sorted in ascending from left to right.
Integers in each column are sorted in ascending from top to bottom.
 
Example 1:

Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
Output: true

Example 2:
Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 20
Output: false
 
Constraints:
m == matrix.length
n == matrix[i].length
1 <= n, m <= 300
-109 <= matrix[i][j] <= 109
All the integers in each row are sorted in ascending order.
All the integers in each column are sorted in ascending order.
-109 <= target <= 109           */

import java.util.*;

//leetcode solution
class Solution 
{
    public boolean searchMatrix(int[][] matrix, int target) 
    {    
        for( int i=0 ; i<matrix.length ; i++ )
        {
            for( int j=0 ; j<matrix[0].length ; j++ )
            {
                if( target==matrix[i][j] )
                    return true;
            }
        }
        return false;
    }
}

//main class for drive the solution
public class Question240
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int t=Sc.nextInt();
        while(t-->0)
        {
            int m=Sc.nextInt();
            int n=Sc.nextInt();
            int matrix[][]=new int[m][n];
            for( int i=0 ; i<m ; i++ )
                for( int j=0 ; j<n ; j++ )
                    matrix[i][j]=Sc.nextInt();

            int target=Sc.nextInt();
            Solution sl=new Solution();
            System.out.print(sl.searchMatrix( matrix, target));
        }
    }
}