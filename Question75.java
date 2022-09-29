/*      75. Sort Colors
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

Example 1:
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]

Example 2:
Input: nums = [2,0,1]
Output: [0,1,2]
 
Constraints:
n == nums.length
1 <= n <= 300
nums[i] is either 0, 1, or 2.
 
Follow up: Could you come up with a one-pass algorithm using only constant extra space?     */


import java.util.Scanner;

//leetcode solution
class Solution 
{
    public void sortColors(int[] nums) 
    {
        for( int i=0 ; i<nums.length ; i++ )
        {
            for( int j=0 ;j<nums.length-1 ; j++ )
            {
                if( nums[j]>nums[j+1] )
                {
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
    }
}

//main class
public class Question75
{
    public static void main(String args[])
    {
        Scanner Sc =new Scanner(System.in);
        int t=Sc.nextInt();
        while(t-->0)
        {
            int index = Sc.nextInt();
            int nums[] = new int[index];
            for( int i=0 ; i<index ; i++ )
                nums[i]=Sc.nextInt();

            Solution sl=new Solution();
            sl.sortColors(nums);
            for( int i=0 ; i<index ; i++ )
                System.out.print(nums[i]+" ");
        }
    }
}