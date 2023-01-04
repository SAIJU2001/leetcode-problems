/*      520. Detect Capital
We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.

Example 1:

Input: word = "USA"
Output: true

Example 2:

Input: word = "FlaG"
Output: false
 
Constraints:
1 <= word.length <= 100
word consists of lowercase and uppercase English letters.           */

import java.util.*;
import java.lang.*;
import java.io.*;

//leetcode solution
class Solution 
{
    public boolean detectCapitalUse(String word) 
    {
        int count=0;
        for(int i=0 ; i<word.length() ; i++ )
            if( Character.isUpperCase( word.charAt(i) ) ) 
                count++;

        if( count==word.length() || count==0 || ( count==1 && 
        Character.isUpperCase( word.charAt(0) )==true ) )
            return true;
        else
            return false;
    }
}

//for Driver solution Code main method
   
class Question520
{
    public static void main(String[] args)
    {
        Scanner Sc=new Scanner(System.in);
        int t =Sc.nextInt();
        while( t-->0 )
        {
            String word = Sc.next();
            Solution sl = new Solution();
            System.out.println( sl.detectCapitalUse( word ) );
        }
    }
}
