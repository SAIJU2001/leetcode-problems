//leetcode


/*  1800. Maximum Ascending Subarray Sum
Easy
644
21
Companies
Given an array of positive integers nums, return the maximum possible sum of an ascending subarray in nums.

A subarray is defined as a contiguous sequence of numbers in an array.

A subarray [numsl, numsl+1, ..., numsr-1, numsr] is ascending if for all i where l <= i < r, numsi  < numsi+1. Note that a subarray of size 1 is ascending.

Example 1:

Input: nums = [10,20,30,5,10,50]
Output: 65
Explanation: [5,10,50] is the ascending subarray with the maximum sum of 65.

Example 2:

Input: nums = [10,20,30,40,50]
Output: 150
Explanation: [10,20,30,40,50] is the ascending subarray with the maximum sum of 150.

Example 3:

Input: nums = [12,17,15,13,10,11,12]
Output: 33
Explanation: [10,11,12] is the ascending subarray with the maximum sum of 33.
 
Constraints:
1 <= nums.length <= 100
1 <= nums[i] <= 100
*/

import java.util.*;

//leetcode solution
class Solution 
{
    public int maxAscendingSum(int[] nums) 
    {
        //initially sum and maxsum assign the 1st array element value
        int sum=nums[0],maxSum=sum;
        for( int i=1 ; i<nums.length ; i++ )
        {
            //check order
            if( nums[i]>nums[i-1] )
            {
                //if ascending add the value to the sum
                sum+=nums[i];
            }
            else
            {
                //if orders break calculate the max sum
                maxSum=Math.max(maxSum,sum);
                sum=nums[i];
            }
        }
        //for the last iteration we could not find the max that's why here
        if (maxSum < sum) 
            maxSum = sum;

        return maxSum;
    }
}

// Driver code
class Question1800 
{
	public static void main(String[] args)
	{
        Scanner Sc=new Scanner(System.in);
        int t=Sc.nextInt();
        while( t-->0 )
        {
            //enter the length of the array
            int len=Sc.nextInt();
            int nums[] =new int[len];
            for( int i=0 ; i<len ; i++ )
            {
                //enter the array element
                nums[i]=Sc.nextInt();
            }
            Solution sl=new Solution();
            System.out.println("maximum possible sum of an ascending subarray is : "+sl.maxAscendingSum( nums));
        }
	}
}