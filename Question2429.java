/*              2429. Minimize XOR

Given two positive integers num1 and num2, find the positive integer x such that:

x has the same number of set bits as num2, and
The value x XOR num1 is minimal.
Note that XOR is the bitwise XOR operation.

Return the integer x. The test cases are generated such that x is uniquely determined.

The number of set bits of an integer is the number of 1's in its binary representation.

Example 1:
Input: num1 = 3, num2 = 5
Output: 3
Explanation:
The binary representations of num1 and num2 are 0011 and 0101, respectively.
The integer 3 has the same number of set bits as num2, and the value 3 XOR 3 = 0 is minimal.

Example 2:
Input: num1 = 1, num2 = 12
Output: 3
Explanation:
The binary representations of num1 and num2 are 0001 and 1100, respectively.
The integer 3 has the same number of set bits as num2, and the value 3 XOR 1 = 2 is minimal.
 
Constraints:
1 <= num1, num2 <= 109              */

import java.util.*;
import java.io.*;
import java.lang.*;

//solution for leetcode
class Solution 
{
    public int minimizeXor(int num1, int num2) 
    {    
        int c1=countSetBit( num1 );
        int c2=countSetBit( num2 );
        if( c1==c2 )
            return num1;
        else if( c1>c2 )
        {
            int diff=c1-c2;
            while( diff-->0 )
                num1=num1&(num1-1);

            return num1;
        }
        else
        {
            int diff=c2-c1;
            while( diff-->0 )
                num1=num1|(num1+1);

            return num1;
        }
    }

    public int countSetBit( int n )
    {
        int count=0;
        while( n>0 )
        {
            count+=(n&1);
            n>>=1;
        }
        return count;
    }
}


//{ Driver Code Starts
// Initial Template for Java

class Question2429 
{
    public static void main(String[] args) 
    {
        Scanner Sc =new Scanner(System.in);
        int t =Sc.nextInt();
        while (t-- > 0) 
        {
            int num1 = Sc.nextInt();
            int num2 = Sc.nextInt();

            Solution ob = new Solution();
            System.out.println( ob.minimizeXor(num1, num2) );
        }
    }
}
// } Driver Code Ends
