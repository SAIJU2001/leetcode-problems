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
        //approach 1

    /*    
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
    */
    
    //approach 2

        divide( nums , 0 , nums.length-1 );
    }

    public void divide( int nums[] ,int si ,int ei )
    {
        if( si>=ei )
            return;

        int mid=si+(ei-si)/2;
        divide( nums , si , mid );
        divide( nums , mid+1 , ei );
        conquer( nums, si, mid, ei );
    }
    
    public void conquer( int nums[], int si, int mid, int ei )
    {
        int idx1=si,idx2=mid+1,x=0;
        int merged[]=new int[ei-si+1];

        while( idx1<=mid && idx2<=ei )
        {
            if( nums[idx1]<nums[idx2] )
                merged[x++]=nums[idx1++];
            else
                merged[x++]=nums[idx2++];
        }

        while( idx1<=mid )
            merged[x++]=nums[idx1++];
        
        while( idx2<=ei )
            merged[x++]=nums[idx2++];

        for( int i=0 , j=si ; i<merged.length ; i++,j++ )
            nums[j]=merged[i];
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