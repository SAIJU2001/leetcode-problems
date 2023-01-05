/*      557. Reverse Words in a String III
Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:
Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"

Example 2:
Input: s = "God Ding"
Output: "doG gniD"
 
Constraints:
1 <= s.length <= 5 * 104
s contains printable ASCII characters.
s does not contain any leading or trailing spaces.
There is at least one word in s.
All the words in s are separated by a single space.         */

import java.util.*;

//leetcode solution

class Solution 
{
    public String reverseWords(String s) 
    {
        int n=s.length()-1;
        int front = 0,back=0;
        char ch[]=s.toCharArray();
        while( front<s.length() )
        {
            while( back<s.length() && ch[back]!=' ' )
                back++;

            reverse( ch, front, back-1 );
            front=back+1;
            back=front;
        }
        String str=new String(ch);
        return str;
    }
    public void reverse( char ch[], int x, int y )
    {
        while( x<=y )
        {
            char temp=ch[x];
            ch[x++]=ch[y];
            ch[y--]=temp;
        }
    }
}

// main class for drive the solution
public class Question557
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int t=Sc.nextInt();
        while( t-->0 )
        {
            String s=Sc.nextLine();
            Solution sl=new Solution();
            String update=sl.reverseWords( s);
            System.out.print( update);
        }
    }
} 