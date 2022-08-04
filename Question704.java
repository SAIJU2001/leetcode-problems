/*      704. Binary Search.
Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4

Example 2:

Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1      */

import java.util.*;
 
public class Question704 
{
    public static int search(int[] nums, int target) 
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
        if( nums[mid]==target ) 
            return mid;
        else 
            return -1;
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
		int pos=search( nums, target);
        
        if(pos==-1)
        System.out.print("The elemnet did not found in the array.");
        else
        System.out.print("The element found in the index no : "+pos);

		}
}