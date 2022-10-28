/*          349. Intersection of Two Arrays
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]

Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
 
Constraints:
1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000             */


import java.util.*;

//leetcode solution
class Solution 
{
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        for( int i=0 ; i<nums1.length ; i++ )
        {
            set1.add(nums1[i]);
        }
        for( int i=0 ; i<nums2.length ; i++ )
        {
            if( set1.contains(nums2[i]) && !set2.contains(nums2[i]) )
            {
                set2.add(nums2[i]);
                list.add(nums2[i]);
            }
        }
        int arr[]=new int[list.size()];
        for( int i=0 ; i<list.size() ; i++ )
        {
            arr[i]=list.get(i);
        }
        return arr;
    }
}


//main class for drive the solution
public class Question349
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int t=Sc.nextInt();
        while(t-->0)
        {
            int n=Sc.nextInt();
            int nums1[]=new int[n];
            int m=Sc.nextInt();
            int nums2[]=new int[m];
            
            for( int i=0 ; i<n ; i++ )
                nums1[i]=Sc.nextInt();

            for( int i=0 ; i<m ; i++ )
                nums2[i]=Sc.nextInt();

            Solution sl=new Solution();
            int arr[]=sl.intersection( nums1, nums2);
            for( int i=0 ; i<arr.length ; i++ )
                System.out.print( arr[i]+" ");
        }
    }
}