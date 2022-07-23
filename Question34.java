/* 34. Find First and Last Position of Element in Sorted Array
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity.

 Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]

Constraints:

0 <= nums.length <= 105
-109 <= nums[i] <= 109
nums is a non-decreasing array.
-109 <= target <= 109 */

import java.util.*;

public class Question34
{
    public static int[] searchRange(int[] nums, int target) 
    {
        int a[]=new int[2];
        int first=-1;
        int last=-1;
        for(int i=0 ; i<nums.length ; i++)
        {
            if(nums[i]==target)
            {
                if(first==-1)
                {
                    first=i;
                    last=i;
                }
                else
                last=i;
            }
            
        }
        a[0]=first;
        a[1]=last;
        
        return a;    
    }

    public static void main(String args[])
    {  
        // array input 
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the no of index you want : ");
        int size = Sc.nextInt();
        int nums[] = new int[size];
        System.out.println();
        for( int i=0 ; i<size ; i++)
            {
                System.out.print("Enter the value of index no "+i+" is : ");
                nums[i] = Sc.nextInt();
            }
            System.out.println();
        System.out.print("Enter the target value : ");
        int target = Sc.nextInt();    

        int a[]=searchRange( nums,  target );
        System.out.print(a[0]+","+a[1]);
    }

}
