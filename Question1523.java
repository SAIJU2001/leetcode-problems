/*          1523. Count Odd Numbers in an Interval Range

Given two non-negative integers low and high. Return the count of odd numbers between low and high (inclusive).

Example 1:
Input: low = 3, high = 7
Output: 3
Explanation: The odd numbers between 3 and 7 are [3,5,7].

Example 2:
Input: low = 8, high = 10
Output: 1
Explanation: The odd numbers between 8 and 10 are [9].
 
Constraints:
0 <= low <= high <= 10^9                */


import java.util.*;

//leetcode solution
class Solution 
{
    public int countOdds(int low, int high) 
    {
        int count=0;
        if( high%2==1 && low%2==1 || high%2==1 || low%2==1)
            return (high-low)/2+1;
        else
            return (high-low)/2;
    }
}


//main class for drive the solution
public class Question1523
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int t=Sc.nextInt();
        while( t-->0 )
        {
            int low=Sc.nextInt();
            int high=Sc.nextInt();
            Solution sl=new Solution();
            System.out.print( sl.countOdds( low, high) );
        } 
    }
}