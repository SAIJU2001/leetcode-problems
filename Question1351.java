/*      1351. Count Negative Numbers in a Sorted Matrix
Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.

Example 1:
Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
Output: 8
Explanation: There are 8 negatives number in the matrix.

Example 2:
Input: grid = [[3,2],[1,0]]
Output: 0
 
Constraints:
m == grid.length
n == grid[i].length
1 <= m, n <= 100
-100 <= grid[i][j] <= 100
 
Follow up: Could you find an O(n + m) solution?         */

import java.util.Scanner;

//leetcode solution
class Solution 
{
    public int countNegatives(int[][] grid) 
    {    
        int count=0;
        for( int i=0 ; i<grid.length ; i++ )
        {
            for( int j=0 ; j<grid[0].length ; j++ )
            {
                if( grid[i][j]<0 )
                    count++;
            }
        }
        return count;
    }
}

//main class
public class Question1351
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int t=Sc.nextInt();
        while(t-->0)
        {
            int row=Sc.nextInt();
            int col=Sc.nextInt();
            int grid[][]=new int[row][col];
            for( int i=0 ; i<row ; i++ )
                for( int j=0 ; j<col ; j++ )
                    grid[i][j]=Sc.nextInt();

            Solution sl=new Solution();
            System.out.print(sl.countNegatives(grid));
        }
    }
}