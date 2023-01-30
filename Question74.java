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

class Solution
{
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        //approach 1

    /*    int count=0;
        
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
            return true;            */
        
        
        //approach 2
            int row=matrix.length;
            int col=matrix[0].length;
            int start=0;
            int end=row*col-1;
    
            while(start<=end)
            {
                int mid=start+(end-start)/2;
    
                int element=matrix[mid/col][mid%col];
                //matrix[mid/col] gives us row number in 2d
                //matrix[mid%col] gives col number in 2d
    
                if( element==target )
                  return true;
                
                else if( element<target )
                  start=mid+1;
                
                else
                  end=mid-1;
            }
            return false;
        }
    }

public class Question74
{ 
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        int t=Sc.nextInt();
        while( t-->0 )
        {
            int row = Sc.nextInt();
            int col = Sc.nextInt();
            int matrix[][] = new int[row][col];
            
            for( int i=0 ; i<row ; i++ )
                for( int j=0 ; j<col ; j++ )
                    matrix[i][j] = Sc.nextInt();
            
            int target = Sc.nextInt();
            Solution sl=new Solution();      
            if( sl.searchMatrix( matrix, target )==true )
                System.out.print("true");
            else
                System.out.print("false");
        }
    }
}