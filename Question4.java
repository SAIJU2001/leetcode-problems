/*          4. Median of Two Sorted Arrays
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

Example 1:
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.

Example 2:
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 
Constraints:
nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106                           */

import java.util.*;

//leetcode solution

class Solution 
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {    
        int idx1=0,idx2=0;
        int idx=nums1.length+nums2.length;
        int nums[]=new int[idx];
        int x=0;
        
        while(idx1<nums1.length && idx2<nums2.length)
        {
            if(nums1[idx1]>=nums2[idx2])
                nums[x++]=nums2[idx2++];
            else
                nums[x++]=nums1[idx1++];
        }
        while(idx1<nums1.length)
        {
             nums[x++]=nums1[idx1++];            
        }
        while(idx2<nums2.length)
        {
            nums[x++]=nums2[idx2++];
        }
                     
        if(idx%2==0)
        return (double)(nums[idx/2]+nums[idx/2-1])/2;
        else
        return nums[idx/2];
        
    }
}

//main class for frive the solution

public class Question4
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int t=Sc.nextInt();
        while(t-->0)
        {
            int n=Sc.nextInt();
            int nums1[]=new int[n];
            for( int i=0 ; i<n ; i++ )
                nums1[i]=Sc.nextInt();

            int m=Sc.nextInt();
            int nums2[]=new int[m];
            for( int i=0 ; i<m ; i++ )
                nums2[i]=Sc.nextInt();

            Solution sl=new Solution();
            System.out.print(sl.findMedianSortedArrays( nums1, nums2 ));
        }
    }
}

