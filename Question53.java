/*      53. Maximum Subarray
Given an integer array nums, find the 
subarray
 with the largest sum, and return its sum.

Example 1:
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.

Example 2:
Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.

Example 3:
Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
 
Constraints:
1 <= nums.length <= 105
-104 <= nums[i] <= 104
 
Follow up: If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.          */

import java.util.*;

//leetcode solution
class Solution 
{
    public int maxSubArray(int[] nums) 
    {
        int sum=0;
        int max=nums[0];
        for( int i=0 ; i<nums.length ; i++ )
        {
            sum+=nums[i];
            max=Math.max( max,sum );
            if( sum<0 )
                sum=0;
        }
        return max;      
    }
}

//main class for drive the solution
public class Question53 
{
    public static void main(String args[]) 
    {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        while ( t--> 0) 
        {
            int n = Sc.nextInt();
            int nums[] = new int[n];
            for( int i=0 ; i<n ; i++ )
                nums[i] = Sc.nextInt();

            Solution ob = new Solution();
            System.out.println( ob.maxSubArray( nums) );
        }
    }
}