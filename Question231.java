/*      231. Power of Two
Given an integer n, return true if it is a power of two. Otherwise, return false.

An integer n is a power of two, if there exists an integer x such that n == 2x.

Example 1:
Input: n = 1
Output: true
Explanation: 20 = 1

Example 2:
Input: n = 16
Output: true
Explanation: 24 = 16

Example 3:
Input: n = 3
Output: false
 
Constraints:
-231 <= n <= 231 - 1                */
 

import java.util.Scanner;

//leetcode solution
class Solution 
{
    public boolean isPowerOfTwo(int n) 
    {    
        int x=(int)(Math.log(n)/Math.log(2));
        
        for( int i=0 ; i<=x ; i++ )
        {
            if( n==(int)Math.pow(2,i))
                return true;
        }
        return false;
    }
}
 
//main class
public class Question231
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int t=Sc.nextInt();
        while(t-->0)
        {
            int n=Sc.nextInt();
            Solution sl=new Solution();
            System.out.print(sl.isPowerOfTwo(n));
        }
    }
}