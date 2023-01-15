/*          387. First Unique Character in a String
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

Example 1:
Input: s = "leetcode"
Output: 0

Example 2:
Input: s = "loveleetcode"
Output: 2

Example 3:
Input: s = "aabb"
Output: -1
 
Constraints:
1 <= s.length <= 105
s consists of only lowercase English letters.           */

import java.util.*;

//leetcode solution
class Solution 
{
    public int firstUniqChar(String s) 
    {    
        if(s.length()==1)
            return 0;
        
        HashMap<Character,Integer> map = new HashMap<>();
        for( int i=0 ; i<s.length() ; i++ )
        {
            if( map.containsKey(s.charAt(i)) )
                map.put( s.charAt(i), 2 );
            else
                map.put( s.charAt(i), 1 );             
        }

        for( int i=0 ; i<s.length() ; i++ )
            if( map.get(s.charAt(i))==1 )
                return i;             
        
        return -1;
    }
}

//main class for drive the solution
class Question387 
{
	public static void main(String[] args)
	{
	    Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        while( t-->0 )
        {
            String s = Sc.next(); 
            Solution obj = new Solution();
            System.out.println( obj.firstUniqChar( s) );    
        }
	}
}

