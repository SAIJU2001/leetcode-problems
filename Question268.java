/* 268. Missing number in array
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

Example 1:

Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

Example 2:

Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums. */

import java.util.*;

public class Question268
{
    public static int MissingNumber(int nums[], int n) 
    {
        int sum=0;
        int sum_natural=n*(n+1)/2;
        
        for( int i=0 ; i<n ; i++ )
        {
            sum+=nums[i];      
        }
        
        int sub=sum_natural-sum;
        return sub;
    }

    
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the no of index you want : ");
        int index = Sc.nextInt();
        int array[] = new int[index];
        System.out.println();
        for( int i=0 ; i<index ; i++)
            {
                System.out.print("Enter the value of index no "+i+" is : ");
                array[i] = Sc.nextInt();
            }
            System.out.println();
        int num = MissingNumber( array, index ); 
        System.out.print("The missing value is : "+num);

    }
}