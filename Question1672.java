/*              1672. Richest Customer Wealth

You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.

A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

Example 1:
Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth of 6 each, so return 6.

Example 2:
Input: accounts = [[1,5],[7,3],[3,5]]
Output: 10
Explanation: 
1st customer has wealth = 6
2nd customer has wealth = 10 
3rd customer has wealth = 8
The 2nd customer is the richest with a wealth of 10.

Example 3:
Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]
Output: 17
 
Constraints:
m == accounts.length
n == accounts[i].length
1 <= m, n <= 50
1 <= accounts[i][j] <= 100                  */

import java.util.*;

//leetcode solution
class Solution 
{
    public int maximumWealth(int[][] accounts) 
    {
        int wealth=0,maxwealth=0;
        for( int i=0 ; i<accounts.length ; i++ )
        {
            for( int j=0 ; j<accounts[0].length ; j++ )
                wealth+=accounts[i][j];
            
            maxwealth=Math.max(maxwealth,wealth);
            wealth=0;
        }
        return maxwealth;
    }
}

//main class for drive the solution
public class Question1672
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int t=Sc.nextInt();
        while( t-->0 )
        {
            int n=Sc.nextInt();
            int m=Sc.nextInt();
            int[][] accounts=new int[n][m];

            for( int i=0 ; i<n ; i++ )
                for( int j=0 ; j<m ; j++ )
                    accounts[i][j]=Sc.nextInt();

            Solution sl=new Solution();
            System.out.print( sl.maximumWealth( accounts) );
        }
    }
}