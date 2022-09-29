/*      744. Find Smallest Letter Greater Than Target
Given a characters array letters that is sorted in non-decreasing order and a character target, return the smallest character in the array that is larger than target.

Note that the letters wrap around.

For example, if target == 'z' and letters == ['a', 'b'], the answer is 'a'.
 
Example 1:
Input: letters = ["c","f","j"], target = "a"
Output: "c"

Example 2:
Input: letters = ["c","f","j"], target = "c"
Output: "f"

Example 3:
Input: letters = ["c","f","j"], target = "d"
Output: "f"
 
Constraints:
2 <= letters.length <= 104
letters[i] is a lowercase English letter.
letters is sorted in non-decreasing order.
letters contains at least two different characters.
target is a lowercase English letter.           */

import java.util.Scanner;

//leetcode solution
class Solution 
{
    public char nextGreatestLetter(char[] letters, char target) 
    {
        char result=letters[0];
        for( int i=0 ; i<letters.length ; i++ )
        {
            if( letters[i]!=target && letters[i]>target )
            {
                result=letters[i];
                break;
            }
        }   
        return result;
    }
}

//main class
public class Question744
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        int t=Sc.nextInt();
        while(t-->0)
        {
            int n=Sc.nextInt(); //size of the array
            char letters[]=new char[n];

            for( int i=0 ; i<n ; i++ )
                letters[i]=Sc.next().charAt(0);

            char target=Sc.next().charAt(0); 

            Solution sl=new Solution(); 
            System.out.print(sl.nextGreatestLetter( letters, target));
        }
    }
}