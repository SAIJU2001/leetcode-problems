/*      43. Multiply Strings
Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.

Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.

Example 1:
Input: num1 = "2", num2 = "3"
Output: "6"

Example 2:
Input: num1 = "123", num2 = "456"
Output: "56088"
 
Constraints:
1 <= num1.length, num2.length <= 200
num1 and num2 consist of digits only.
Both num1 and num2 do not contain any leading zero, except the number 0 itself.     */

import java.util.*;


//solution for leetcode
import java.math.*;
class Solution 
{
    public String multiply(String num1, String num2) 
    {    
        BigInteger val1=new BigInteger(num1);
        BigInteger val2=new BigInteger(num2);
        BigInteger result=val1.multiply(val2);
        return result.toString();
    }
}

//main class
public class Question43
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int t=Sc.nextInt();
        while( t-->0 )
        {
            String num1=Sc.next();
            String num2=Sc.next();
            Solution sl=new Solution();
            String result=sl.multiply( num1, num2 );
            System.out.print(Integer.parseInt(result));
        }
    }
}