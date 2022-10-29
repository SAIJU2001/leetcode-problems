/*      242. Valid Anagram
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false
 
Constraints:
1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
 
Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
*/

import java.util.*;

//leetcode solution

class Solution 
{
    public boolean isAnagram(String s, String t) 
    {   
        char ch1[]=s.toCharArray();
        char ch2[]=t.toCharArray();
        
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        
        return Arrays.equals(ch1,ch2);
    }
}

//main class for drive the solution

class Question242
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int tc=Sc.nextInt();
        while(tc-->0)
        {
            String s=Sc.next();
            String t=Sc.next();

            Solution sl=new Solution();
            System.out.print(sl.isAnagram( s, t));
        }
    }
}