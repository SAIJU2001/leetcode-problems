/*  41. First Missing Positive
Given an unsorted integer array nums, return the smallest missing positive integer.

You must implement an algorithm that runs in O(n) time and uses constant extra space.

Example 1:
Input: nums = [1,2,0]
Output: 3
Explanation: The numbers in the range [1,2] are all in the array.

Example 2:
Input: nums = [3,4,-1,1]
Output: 2
Explanation: 1 is in the array but 2 is missing.

Example 3:
Input: nums = [7,8,9,11,12]
Output: 1
Explanation: The smallest positive integer 1 is missing.
 
Constraints:
1 <= nums.length <= 105
-231 <= nums[i] <= 231 - 1              */


import java.util.*;

//leetcode solution

class Solution 
{
    public int firstMissingPositive(int[] nums) 
    {    
        HashSet <Integer> set=new HashSet<>();
        int count=1,result=0;
        int last=nums.length;
        for( int i=0 ; i<last ; i++ )
        {
            if( !set.contains(nums[i]) && nums[i]>0 )
                set.add(nums[i]);
        }
        for( int i=0 ; i<=last ; i++ )
        {
            if( set.contains(count) )
                count++;
            else 
            {
                result=count;
                break;
            }
        }
        return result;
    }
}

//main class for frive the solution
public class Question41
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int t=Sc.nextInt();
        while(t-->0)
        {
            int n=Sc.nextInt();
            int nums[]=new int[n];
            for( int i=0 ; i< n ; i++ )
            {
                nums[i]=Sc.nextInt();
            }
            Solution sl=new Solution();
            System.out.print(sl.firstMissingPositive(nums));
        }
    }
}



