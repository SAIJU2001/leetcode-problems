/*      59. Spiral Matrix II
Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.

Example 1:
Input: n = 3
Output: [[1,2,3],[8,9,4],[7,6,5]]

Example 2:
Input: n = 1
Output: [[1]]
 
Constraints:
1 <= n <= 20            */

import java.util.*;

//leetcode solution

class Solution 
{
    public int[][] generateMatrix(int n) 
    {
        int[][] matrix=new int[n][n]; 
        int top=0,bottom=matrix.length-1;
        int left=0,right=matrix[0].length-1;
        int count=0,noCount=1;
        while( left<=right && top<=bottom )
        {
            if( count==0 )
            {
                for( int i=left ; i<=right ; i++ )
                    matrix[top][i]=noCount++;
                top++;
            }
            else if( count==1 )
            {
                for( int i=top ; i<=bottom ; i++ )
                    matrix[i][right]=noCount++;
                right--;
            }
            else if( count==2 )
            {
                for( int i=right ; i>=left ; i-- )
                    matrix[bottom][i]=noCount++;
                bottom--;
            }
            else if( count==3 )
            {
                for( int i=bottom ; i>=top ; i-- )
                    matrix[i][left]=noCount++;
                    left++;
            }
            count++;
            count=count%4;
        }
        return matrix;
    }
}

//main class for drive the program
public class Question59
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int t=Sc.nextInt();
        while(t-->0)
        {
            int n=Sc.nextInt();
            Solution sl=new Solution();
            int arr[][]=sl.generateMatrix(n);

            for( int i=0 ; i<arr.length ; i++ )
                for( int j=0 ; j<arr[0].length ; j++ )
                    System.out.print(arr[i][j]+" ");
        }
    }
}