/*      136. Single Number
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:
Input: nums = [2,2,1]
Output: 1

Example 2:
Input: nums = [4,1,2,1,2]
Output: 4

Example 3:
Input: nums = [1]
Output: 1
 
Constraints:
1 <= nums.length <= 3 * 104
-3 * 104 <= nums[i] <= 3 * 104
Each element in the array appears twice except for one element which appears only once.     */

import java.util.Scanner;

//leetcode solution
class Solution 
{
    public int singleNumber(int[] nums) 
    {    
        int result=0;
        for( int i=0 ; i<nums.length ; i++ )
        {
            result=result^nums[i];
        }
        return result;
    }
}

//main class
public class Question136
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int t=Sc.nextInt();
        while(t-->0)
        {
            int n=Sc.nextInt();
            int nums[]=new int[n];
            for( int i=0 ; i<n ; i++ )
                nums[i]=Sc.nextInt();

            Solution sl=new Solution();
            System.out.print(sl.singleNumber(nums));
        }
    }
}