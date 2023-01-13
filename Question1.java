/*      1. Two Sum
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]
 
Constraints:
2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.           */
 

import java.util.*;

//solution for leetcode
class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {    
        //approach 1 (brute force)  
    /*   int arr[] = new int[2];
    
        for( int i=0 ; i<nums.length ; i++ )
            for( int j=i+1 ; j<nums.length ; j++ )
                if( nums[i]+nums[j]==target )
                {
                    arr[0]=i;
                    arr[1]=j;
                    break;
                }
        return arr;*/

    //approach 2(using hashmap)
        int arr[]=new int[2];
        HashMap<Integer,Integer>map=new HashMap<>();
        for( int i=0 ; i<nums.length ; i++ )
        {
            if( map.containsKey(target-nums[i]) )
            {
                arr[0]=map.get(target-nums[i]);
                arr[1]=i;
                return arr;
            }   
            map.put(nums[i],i);
        }
        return arr;
    }
}

//main class for drive the solution
public class Question1
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        while( t-->0 )
        {
            int n=Sc.nextInt();
            int nums[]=new int[n];
            for( int i=0 ; i<n ; i++ )
                nums[i]=Sc.nextInt();
            
            int target=Sc.nextInt();
            Solution sl=new Solution();
            int arr[]=sl.twoSum( nums, target);

            for( int i=0 ; i<arr.length ; i++ )
                System.out.print( arr[i]+" " );
        }
    }
}