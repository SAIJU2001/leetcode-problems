/*              1678. Goal Parser Interpretation

You own a Goal Parser that can interpret a string command. The command consists of an alphabet of "G", "()" and/or "(al)" in some order. The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al". The interpreted strings are then concatenated in the original order.

Given the string command, return the Goal Parser's interpretation of command.

Example 1:
Input: command = "G()(al)"
Output: "Goal"
Explanation: The Goal Parser interprets the command as follows:
G -> G
() -> o
(al) -> al
The final concatenated result is "Goal".

Example 2:
Input: command = "G()()()()(al)"
Output: "Gooooal"

Example 3:
Input: command = "(al)G(al)()()G"
Output: "alGalooG"
 
Constraints:
1 <= command.length <= 100
command consists of "G", "()", and/or "(al)" in some order.         */

import java.util.*;

//leetcode solution
class Solution 
{
    public String interpret(String command) 
    {
        String result="";
        int i=0;
        while( i<command.length() )
        {
            if( command.charAt(i)=='G' )
                result=result+'G';
            else if( command.charAt(i)=='(' && command.charAt(i+1)==')' )
            {
                result=result+'o';
                i++;
            }
            else if( command.charAt(i)=='(' && command.charAt(i+1)=='a' )
            {
                result=result+'a'+'l';
                i+=3;
            }
            i++;
        }            
        return result;
    }
}

//main class for drive the solution
public class Question1678
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int t=Sc.nextInt();
        while( t-->0 )
        {
            String command=Sc.next();
            Solution sl=new Solution();
            System.out.print( sl.interpret( command) );
        } 
    }
}