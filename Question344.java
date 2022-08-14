/*  344. Reverse String.
Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
 
Constraints:

1 <= s.length <= 105
s[i] is a printable ascii character.    */

import java.util.Scanner;

public class Question344 
{
    //this is the method write in leetcode which is reverse the string
    public static void reverseString(char[] s) 
    {    
        int n=s.length;
        int front = 0;
        int back = n-1;
        
        for( int i=0 ; i<n/2 ; i++ )
        {
            char temp = s[front];
            s[front]=s[back];
            s[back]=temp;
            front++;
            back--;
        }
        
    }
    // for print the element of the array
    public static void print(char s[])
    {
        for(int i=0 ; i<s.length ; i++ )
        {
            System.out.print(s[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String S = Sc.next();
        System.out.println();

        char s[]=new char[S.length()];
        for(int i=0 ; i<S.length() ; i++ )
        {
            s[i]=S.charAt(i);
        }
        //before the operation
        System.out.print("Before the operation : ");
        print(s);

        //call the method reverse string
        reverseString(s);

        //after the operation
        System.out.print("After the operation : ");
        print(s);
    }
}