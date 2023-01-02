/*      11. Container With Most Water
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.

Example 1:

Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

Example 2:

Input: height = [1,1]
Output: 1
 
Constraints:
n == height.length
2 <= n <= 105
0 <= height[i] <= 104       */

import java.util.*;

//this is the solution for letcode
class Solution 
{
    public int maxArea(int[] height) 
    {
        int head=0;
        int tail=height.length-1;
        int maxArea=0,area=0;
        while( head<tail )
        {
            area=Math.min( height[head], height[tail] )*( tail-head );
            
            if( maxArea<area)
                maxArea=area;
                
            if( Math.min( height[head], height[tail] )== height[tail] )
                tail--;
            else
                head++;
        }
        return maxArea;    
    }
}

//for drive the solution main class and method
class Question11
{
	public static void main (String[] args)
    {
	    Scanner Sc = new Scanner(System.in);
		int t = Sc.nextInt();; //Inputting the testcases
		while(t-->0)
        {
		    int n = Sc.nextInt(); // input size of array
		    int height[] = new int[n];
		    for( int i=0; i<n; i++ )
		        height[i] = Sc.nextInt(); // input elements of array
		    
		    Solution sl = new Solution();
            System.out.println( sl.maxArea( height) );
		}
	}
}