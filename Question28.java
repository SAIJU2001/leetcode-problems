/*      28. Find the Index of the First Occurrence in a String

Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:
Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.

Example 2:
Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
 
Constraints:
1 <= haystack.length, needle.length <= 104              
haystack and needle consist of only lowercase English characters.       */

import java.util.*;

//leetcode solution
class Solution 
{
    public int strStr(String haystack, String needle) 
    {
        int n=haystack.length();
        int m=needle.length();
        if( n==m && haystack.equals(needle ))
            return 0;

        for( int i=0 ; i<=n-m ; i++ )
        {
            if( haystack.substring(i,i+m).equals(needle) )
                return i;
        }
        return -1;
    }
}

//main class for drive the solution
public class Question28
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int t=Sc.nextInt();
        while( t-->0 )
        {
            String haystack=Sc.next();
            String needle=Sc.next();
            Solution sl=new Solution();
            System.out.print( sl.strStr( haystack, needle) );
        }
    }
}