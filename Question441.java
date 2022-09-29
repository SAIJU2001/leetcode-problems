/*      441. Arranging Coins.
You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.

Given the integer n, return the number of complete rows of the staircase you will build.

Example 1:
Input: n = 5
Output: 2
Explanation: Because the 3rd row is incomplete, we return 2.

Example 2:
Input: n = 8
Output: 3
Explanation: Because the 4th row is incomplete, we return 3.
 
Constraints:
1 <= n <= 231 - 1       */

import java.util.*;

//this is the solution for leetcode 
class Solution 
{
    public int arrangeCoins(int n) 
    {
        int count=0,val=1;
        while(n>0)
        {
            n=n-val;
            val++;
            
            if(n>=0)
            count++;
        }
        return count++;
    }
}

//main class 
class Question441
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        int t=Sc.nextInt();
        while(t-->0)
        {
            int n=Sc.nextInt();
            Solution lt = new Solution();
            System.out.print(lt.arrangeCoins(n));
        }
    }
}