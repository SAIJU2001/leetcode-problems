/*          1768. Merge Strings Alternately

You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.

Example 1:
Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r

Example 2:
Input: word1 = "ab", word2 = "pqrs"
Output: "apbqrs"
Explanation: Notice that as word2 is longer, "rs" is appended to the end.
word1:  a   b 
word2:    p   q   r   s
merged: a p b q   r   s

Example 3:
Input: word1 = "abcd", word2 = "pq"
Output: "apbqcd"
Explanation: Notice that as word1 is longer, "cd" is appended to the end.
word1:  a   b   c   d
word2:    p   q 
merged: a p b q c   d
 
Constraints:
1 <= word1.length, word2.length <= 100
word1 and word2 consist of lowercase English letters.                   */


import java.util.*;

//leetcode solution
class Solution 
{
    public String mergeAlternately(String word1, String word2) 
    {
        //1st approach

/*         String ans="";
        int low1=0,low2=0,high1=word1.length(),high2=word2.length();
        while( low1<high1 && low2<high2 )
        {
            ans+=word1.charAt( low1++ );
            ans+=word2.charAt( low2++ );
        }

        while( low1<high1 )
            ans=ans+word1.charAt( low1++ );

        while( low2<high2 )
            ans=ans+word2.charAt( low2++ );

        return ans;             */

        //second approach
        int n1 = word1.length();
        int n2 = word2.length();
        String ans = "";
        int len = Math.max(n1,n2);

        for(int i = 0; i < len; i++)
        {
            if(i < n1)
                ans += "" + word1.charAt(i);

            if(i < n2)
                ans += "" + word2.charAt(i);
        } 
        return ans;
    }
}

//main class for drive the solution
public class Question1768
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int t=Sc.nextInt();
        while( t-->0 )
        {
            String word1=Sc.next();
            String word2=Sc.next();
            Solution sl=new Solution();
            System.out.print( sl.mergeAlternately( word1, word2 ) );
        }
    }
}