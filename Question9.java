/* 9. Palindrome Number.
Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward.

For example, 121 is a palindrome while 123 is not.
 
Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Constraints:

-231 <= x <= 231 - 1    */

import java.util.*;

public class Question9
{
    public static boolean isPalindrome(int x)
    {
        boolean b1=true;
        boolean b2=false;
        int n = x;
        int rem = 0;
        int a= 0;
        while(n>0)
        {
            a = n%10;
            rem = rem*10+a;
            n = n/10;
        }
            if(x == rem)
            {
                return b1;
            }
            else
            {
                return b2;
            }
        
    }
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = Sc.nextInt();
        System.out.println();
        System.out.print(isPalindrome( num ));
    }
}