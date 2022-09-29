/*          69. Sqrt(x)
Given a non-negative integer x, compute and return the square root of x.

Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.

Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5.

Example 1:
Input: x = 4
Output: 2

Example 2:
Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.
 
Constraints:
0 <= x <= 231 - 1               */

import java.util.Scanner;

//leetcode solution
class Solution 
{
    public int mySqrt(int x) 
    {
        return (int)sqrt(x);
    }
    
    public long sqrt(int number)
    {
        long low = 1;
        long high = number;
        long ans = 0;
        long mid = (low + high)/2;
        while(low<=high)
        {
            long msq=mid*mid;
            if(msq == number)
            {
                return mid;
            }
            else if(msq > number)
            {
                high = mid-1;
            }
            else
            {
                ans = mid;
                low = mid+1;
            }
            mid = (low + high)/2;
        }
        return ans;
    }
}

//main class
public class Question69
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        int t=Sc.nextInt();
        while(t-->0)
        {
            int n=Sc.nextInt(); 
            Solution sl=new Solution();
            System.out.print(sl.mySqrt(n));
        }
    }
}