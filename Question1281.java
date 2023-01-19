/*          1281. Subtract the Product and Sum of Digits of an Integer
Given an integer number n, return the difference between the product of its digits and the sum of its digits.
 
Example 1:
Input: n = 234
Output: 15 
Explanation: 
Product of digits = 2 * 3 * 4 = 24 
Sum of digits = 2 + 3 + 4 = 9 
Result = 24 - 9 = 15

Example 2:
Input: n = 4421
Output: 21
Explanation: 
Product of digits = 4 * 4 * 2 * 1 = 32 
Sum of digits = 4 + 4 + 2 + 1 = 11 
Result = 32 - 11 = 21
 
Constraints:
1 <= n <= 10^5          */

import java.util.*;

//leetcode solution
class Solution 
{
    public int subtractProductAndSum(int n) 
    {
        int mul=1,sum=0,rev=0;
        while( n!=0 )
        {
            rev=n%10;
            sum+=rev;
            mul*=rev;
            n=n/10;
        }
        return mul-sum;
    }
}

//main class for drive the solution
public class Question1281
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int t=Sc.nextInt();
        while( t-->0 )
        {
            int n=Sc.nextInt();
            Solution sl=new Solution();
            System.out.print( sl.subtractProductAndSum( n) );
        }
    }
}