//leetcode

/*  342. Power of Four

Given an integer n, return true if it is a power of four. Otherwise, return false.

An integer n is a power of four, if there exists an integer x such that n == 4x.

 
Example 1:

Input: n = 16
Output: true
Example 2:

Input: n = 5
Output: false
Example 3:

Input: n = 1
Output: true
 
Constraints:
-231 <= n <= 231 - 1
 
Follow up: Could you solve it without loops/recursion?
*/


import java.util.*;

//solution for leetcode
class Solution 
{
    public boolean isPowerOfFour(int n) 
    {
        if( n==1 )
        return true;
        
        if( n%4!=0 || n<=0 )
        return false;
        
        //recursive call
        return isPowerOfFour( n/4 );
    }
}

//main method for drive the program
class Question342
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int t=Sc.nextInt();
        while(t-->0)
        {
            int n=Sc.nextInt();
            Solution sl=new Solution();
            if( sl.isPowerOfFour(n))
                System.out.print("Entered number is power of four");
            else
                System.out.print("Entered number is not power of four");
        }
    }
}