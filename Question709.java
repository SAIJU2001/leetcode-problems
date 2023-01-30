/*          709. To Lower Case

Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.

Example 1:
Input: s = "Hello"
Output: "hello"

Example 2:
Input: s = "here"
Output: "here"

Example 3:
Input: s = "LOVELY"
Output: "lovely"
 
Constraints:
1 <= s.length <= 100
s consists of printable ASCII characters.       */


import java.util.*;

//leetcode solution
class Solution 
{
    public String toLowerCase(String s) 
    {
        return s.toLowerCase();
    }
}

//main class for drive the solution
public class Question709
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int t=Sc.nextInt();
        while( t-->0 )
        {
            String s=Sc.next();
            Solution sl=new Solution();
            System.out.print( sl.toLowerCase( s) );
        } 
    }
}