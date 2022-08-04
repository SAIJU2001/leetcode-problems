/*  35. Search Insert Position.
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2

Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1

Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4
 
Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums contains distinct values sorted in ascending order.
-104 <= target <= 104       */

import java.util.*;

public class Question35 
{
    public static int searchInsert(int[] nums, int target) 
    {
        int low=0;
        int high=nums.length-1;
        int mid=0;
        
       while( high>=low )
       {
           mid=low+(high-low)/2;
           
           if( target<nums[mid])
            {
                high=mid-1;
            }
            else if( target>nums[mid])
            {
                low=mid+1;
            }
           else 
               return mid;
        }
       return low;
        
    }
    public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
		int n = sc.nextInt();
		System.out.println();	

		int nums[] = new int[n];
			
		//inserting elements to the array
		for( int i=0 ; i<n ; i++)
		{
            System.out.print("Enter the value of index no "+i+" : ");
			nums[i] = sc.nextInt(); 
		}
		System.out.println();
        
        // input the target value
        System.out.print("Enter the target elemnet : ");
		int target = sc.nextInt();
			
		//calling () method
		int pos=searchInsert( nums, target);
        System.out.print("The element found in the index no : "+pos);

		}
    }
