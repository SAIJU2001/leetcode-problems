/* 74. Search a 2D Matrix.
Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.
 
Example 1:

Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true

Example 2:

Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false
 
Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 100
-104 <= matrix[i][j], target <= 104     */

import java.util.*;

public class Question74 
{
    public static boolean searchMatrix(int[][] matrix, int target) 
    {
        int count=0;
        
        for( int i=0 ; i<matrix.length ; i++ )
        {
            for( int j=0 ;j<matrix[0].length ; j++ )
            {
                if( matrix[i][j]==target )
                    count++;
            }
        }
        if( count==0 )
            return false;
        else
            return true;
        
    }
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the no of rows you want : ");
        int row = Sc.nextInt();
        System.out.print("Enter the no of columns you want : ");
        int col = Sc.nextInt();
        int matrix[][] = new int[row][col];
        System.out.println();
        for( int i=0 ; i<row ; i++ )
        {
            for( int j=0 ; j<col ; j++ )
            {
                System.out.print("Enter the value of index no "+i+"th row "+j+"th column is : ");
                matrix[i][j] = Sc.nextInt();
            }
            System.out.println();
        }
        System.out.println(); 
        System.out.print("Enter the target value : ");
        int target = Sc.nextInt();      
        if( searchMatrix( matrix, target )==true )
            System.out.print("The target is present in the array.");
        else
        System.out.print("The target is not present in the array.");

    }
}