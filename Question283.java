/*  283. Move Zeroes.
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Example 2:

Input: nums = [0]
Output: [0]
 
Constraints:

1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1  */

import java.util.Scanner;

public class Question283 
{
    //method for moves zero operation
    public static void moveZeroes(int[] nums) 
    {
        int zPoint =0;  //pointer indicate to the zero
        int nonzPoint=0;    //pointer indicate to the non zero
        int len=nums.length;
        
        if( len==0 || len==1 )
            return;
        
        while( nonzPoint<len )
        {
            if( nums[nonzPoint]==0 )
            {
                nonzPoint++;
            }
            else
            {
                //swaping between zero and non zero element
                int temp = nums[zPoint];
                nums[zPoint] = nums[nonzPoint];
                nums[nonzPoint] = temp;
                zPoint++;
                nonzPoint++;
            }
        }
            
    }

    //method for print the array
    public static void print( int nums[] )
    {
        for( int i=0 ; i<nums.length ; i++ )
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

        //before the operation the array element
        System.out.print("Before the operation the array elements are : ");
        print( nums );

        //call the method for moves zero opeartion
        moveZeroes( nums );

        //after the operation the array element
        System.out.print("After the operation the array elements are : ");
        print( nums );
    }
}
