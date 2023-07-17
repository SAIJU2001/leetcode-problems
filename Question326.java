//leetcode

/*  326. Power of Three

Given an integer n, return true if it is a power of three. Otherwise, return false.

An integer n is a power of three, if there exists an integer x such that n == 3x.

Example 1:

Input: n = 27
Output: true
Explanation: 27 = 33
Example 2:

Input: n = 0
Output: false
Explanation: There is no x where 3x = 0.
Example 3:

Input: n = -1
Output: false
Explanation: There is no x where 3x = (-1).
 
Constraints:
-231 <= n <= 231 - 1
 
Follow up: Could you solve it without loops/recursion?
*/


import java.util.*;

//solution for leetcode
class Solution 
{
    public boolean isPowerOfThree(int n) 
    {
        if( n==1 )
            return true;
        
        if( n<=0 || n%3!=0 )
            return false;
        
        return isPowerOfThree( n/3);
    }
}


//main method for drive the program
class Question326
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int t=Sc.nextInt();
        while(t-->0)
        {
            int n=Sc.nextInt();
            Solution sl=new Solution();
            if( sl.isPowerOfThree( n))
                System.out.print("Entered number is power of Three.");
            else
                System.out.print("Entered number is not power of Three.");
        }
    }
}