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
        // approach 1
            /*     char ch1[]=s.toCharArray();
                char ch2[]=t.toCharArray();
                
                Arrays.sort(ch1);
                Arrays.sort(ch2);
                
                return Arrays.equals(ch1,ch2);
                */
        //approach 2
        HashMap<Character,Integer>map=new HashMap<>();
        if( s.length()!=t.length() )
            return false;

        for( int i=0 ; i<s.length() ; i++ )
        {
            char ch=s.charAt(i);
            map.put( ch, map.getOrDefault( ch, 0 )+1 );
        }

        for( int i=0 ; i<t.length() ; i++ )
        {
            char ch=t.charAt(i);
            if( !map.containsKey(ch) )
                return false;

            if( map.get(ch)==1 )
                map.remove(ch);
            else
                map.put( ch, map.get(ch)-1 );
        }
        return true;
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
