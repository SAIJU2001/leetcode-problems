//leetcode

/*          14. Longest Common Prefix
Easy
15.1K
4.1K
Companies
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 
Constraints:
1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.
*/

import java.util.*;

class Solution 
{
    public String longestCommonPrefix(String[] strs) 
    {
        Arrays.sort(strs);      //sort the array
        String first=strs[0];   
        String last=strs[strs.length-1];
        int i=0;
        //just compare first and last string and return the prefix
        while( i<first.length() )
        {
            if( first.charAt(i)==last.charAt(i) )
            {
                i++;
            }
            else
            {
                break;
            }
        }
        return i==0? "": strs[0].substring(0,i);
    }
}

//driver code
public class Question14
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int t=Sc.nextInt();
        while( t-->0 )
        {
            int n=Sc.nextInt();
            String[] strs=new String[n];

            for( int i=0 ; i<n ; i++  )
            {
                strs[i]=Sc.next();
            }
            Solution sl=new Solution();
            String result=sl.longestCommonPrefix( strs);
            System.out.print( result);
        }
    }
}