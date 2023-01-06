/*      1662. Check If Two String Arrays are Equivalent
Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.

A string is represented by an array if the array elements concatenated in order forms the string.

Example 1:
Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
Output: true
Explanation:
word1 represents string "ab" + "c" -> "abc"
word2 represents string "a" + "bc" -> "abc"
The strings are the same, so return true.

Example 2:
Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
Output: false

Example 3:
Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
Output: true
 
Constraints:
1 <= word1.length, word2.length <= 103
1 <= word1[i].length, word2[i].length <= 103
1 <= sum(word1[i].length), sum(word2[i].length) <= 103
word1[i] and word2[i] consist of lowercase letters.         */

import java.util.*;

//leetcode solution
class Solution
{
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) 
    {
        String s1="",s2="";
        for( int i=0 ; i<word1.length ; i++ )
            s1=s1+word1[i];
        for( int i=0 ; i<word2.length ; i++ )
            s2=s2+word2[i];

        if( s1.equals(s2) )
            return true;
        return false;
    }
}

//main class for drive the solution
public class Question1662
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        int t=Sc.nextInt();
        while( t-->0 )
        {
            int n=Sc.nextInt();
            String[] word1=new String[n];
            for( int i=0 ; i<n ; i++ )
                word1[i]=Sc.next();
            int m=Sc.nextInt();
            String[] word2=new String[m];
            for( int i=0 ; i<m ; i++ )
                word2[i]=Sc.next();
            Solution sl=new Solution();
            System.out.print( sl.arrayStringsAreEqual( word1, word2) );
        }
    }
}