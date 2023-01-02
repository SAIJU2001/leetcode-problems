/*      7. Reverse Integer
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

Example 1:
Input: x = 123
Output: 321

Example 2:
Input: x = -123
Output: -321

Example 3:
Input: x = 120
Output: 21
 
Constraints:
-231 <= x <= 231 - 1        */

import java.util.*;

//this is the leetcode solution
class Solution 
{
    public int reverse(int x) 
    {
        int n=x;
        int reverse=0;
    
        while(n!=0)
        {
            int rem=n%10;
            int result=reverse*10+rem;
            
            if ((result - rem) / 10 != reverse) return 0;
            
            reverse = result;
            
            n=n/10;
        }
        
        if(reverse>Integer.MAX_VALUE && reverse<Integer.MIN_VALUE)
            return 0;
        else
            return reverse;

    }
}

//main class create
class Question7
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the no of Test case : ");
        int t=Sc.nextInt();
        while(t-->0)
        {
            System.out.print("Enter the value : ");
            int x=Sc.nextInt();
            Solution lt = new Solution();
            System.out.print( lt.reverse( x));
        }
    }
}