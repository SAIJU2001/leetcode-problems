/*  977. Squares of a Sorted Array.
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].

Example 2:

Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 
Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums is sorted in non-decreasing order.     */

import java.util.Scanner;

public class Question977 
{
    public static void conquer( int nums[], int si, int mid, int ei)
    {
        int merged[] = new int[ei-si+1];
        int idx1=si;
        int idx2=mid+1;
        int x=0;

        while( idx1<=mid && idx2<=ei )
        {
            if( nums[idx1]<=nums[idx2])
                merged[x++]=nums[idx1++];
            else
                merged[x++]=nums[idx2++];
        }
        while( idx2<=ei )
        {
                merged[x++]=nums[idx2++];
        }
        while( idx1<=mid )
        {
                merged[x++]=nums[idx1++];
        }

        for( int i=0,j=si ; i<merged.length ; i++,j++)
        {
            nums[j]=merged[i];
        }

    }

    public static void divided( int nums[], int si, int ei)
    {
        if( si>=ei )
        return;

        int mid = si+(ei-si)/2;
        divided( nums, si, mid);
        divided( nums, mid+1, ei);
        conquer( nums ,si, mid, ei);
    }

    public static int[] sortedSquares(int[] nums) {
        
        for( int i=0 ; i<nums.length ; i++ )
        {
            nums[i]=nums[i]*nums[i];
        }
        divided( nums,0,nums.length-1);

        
        return nums;
    }

    public static void print(int nums[])
    {
        for(int i=0 ; i<nums.length ; i++ )
        {
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);

        //input the size of the array
        System.out.print("Enter the length of the array : ");
        int len = Sc.nextInt();
        System.out.println();

        //creat an array
        int nums[] = new int[len];

        //input the array elements
        for( int i=0 ; i<len ; i++ )
        {
            System.out.print("Enter the value of the index no "+i+" : "); 
            nums[i]=Sc.nextInt();
        }
        System.out.println();

        //before the square and sorting
        System.out.print("before sorting : ");
        print(nums);

        //call the square method
        sortedSquares(nums);

        //call the method
        divided( nums, 0, len-1);

        //after the square and sorting
        System.out.print("After the squares and sorted the array : ");
        print(nums);
    }
}