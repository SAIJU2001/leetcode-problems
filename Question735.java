/*      735. Asteroid Collision
We are given an array asteroids of integers representing asteroids in a row.

For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, negative meaning left). Each asteroid moves at the same speed.

Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.

Example 1:

Input: asteroids = [5,10,-5]
Output: [5,10]
Explanation: The 10 and -5 collide resulting in 10. The 5 and 10 never collide.

Example 2:

Input: asteroids = [8,-8]
Output: []
Explanation: The 8 and -8 collide exploding each other.

Example 3:

Input: asteroids = [10,2,-5]
Output: [10]
Explanation: The 2 and -5 collide resulting in -5. The 10 and -5 collide resulting in 10.
 
Constraints:
2 <= asteroids.length <= 104
-1000 <= asteroids[i] <= 1000
asteroids[i] != 0       */

import java.io.*;
import java.util.*;

//leetcode solution
class Solution 
{
    public int[] asteroidCollision(int[] asteroids) 
    {
        Stack<Integer> st=new Stack<>();
        for( int i=0 ; i<asteroids.length ; i++ )
        {
            if( asteroids[i]>0 )
                st.push( asteroids[i] );
            else
            {
                while( !st.isEmpty() && st.peek()>0 && st.peek()<Math.abs( asteroids[i] ) )
                    st.pop();
                
                if( !st.isEmpty() && st.peek()==Math.abs( asteroids[i] ) )
                    st.pop();
                    
                else if( st.isEmpty() || st.peek()<0 )
                    st.push( asteroids[i] );    
            }
        }
        int arr[]=new int[st.size()];
        for( int i=st.size()-1 ; i>=0 ; i-- )
            arr[i]=st.pop();
            
        return arr;
    }
}


//for drive the solution main method

class Question735 
{
    public static void main(String[] args) throws IOException 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) 
        {
            int N;
            N = sc.nextInt();

            int[] asteroids = new int[N];
            for (int i = 0; i < N; i++) asteroids[i] = sc.nextInt();

            Solution obj = new Solution();
            int[] res = obj.asteroidCollision( asteroids);

            for (int e : res) System.out.print(e + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends