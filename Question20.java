/*          20. Valid Parentheses
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 
Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false
 
Constraints:
1 <= s.length <= 104
s consists of parentheses only '()[]{}'.        */

import java.util.*;

//leetcode solution
class Solution 
{
    public boolean isValid(String s) 
    {
        Stack<Character> st=new Stack<>();

        for( int i=0 ; i<s.length() ; i++ )
        {
            if( s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[' )
                st.push( s.charAt(i) );

            else if( !st.isEmpty() && ( (st.peek()=='(' && s.charAt(i)==')' ) ||
            (st.peek()=='{' && s.charAt(i)=='}' ) || (st.peek()=='[' && s.charAt(i)==']' ) ))
                st.pop();
                
            else 
                return false;    
        }
        if( !st.isEmpty() )
            return false;

        return true;
    }
}

//main class for drive the solution
public class Question20 
{
    public static void main(String args[]) 
    {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        while ( t--> 0) 
        {
            String s = Sc.next();
            
            Solution ob = new Solution();

            if( ob.isValid( s)==true )
                System.out.print( "true" );
            else
                System.out.print( "false" );
        }
    }
}