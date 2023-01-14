/*      350. Intersection of Two Arrays II
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]

Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.
 
Constraints:
1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000
 
Follow up:
What if the given array is already sorted? How would you optimize your algorithm?
What if nums1's size is small compared to nums2's size? Which algorithm is better?
What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?         */

import java.util.*;

//leetcode solution
class Solution 
{
    public int[] intersect(int[] nums1, int[] nums2) 
    {
        ArrayList<Integer>list=new ArrayList<>();
        //sorted the two arrays
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n=nums1.length;
        int m=nums2.length;
        int i=0,j=0;
        //for intersection conditon
        while( i<n && j<m )
        {
            if( nums1[i]>nums2[j] )
                j++;
            else if( nums1[i]<nums2[j] )
                i++;
            else
            {
                list.add(nums2[j]);
                i++;
                j++;
            }
        }
        int arr[]=new int[list.size()];
        for( int k=0 ; k<list.size() ; k++ )
            arr[k]=list.get(k );

        return arr;
    }
}

//main class for drive the solution
public class Question350
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        int t=Sc.nextInt();
        while( t-->0 )
            {
            //first array
            int n = Sc.nextInt();
            int nums1[] = new int[n];
            for( int i=0 ; i<n ; i++ )
                nums1[i] = Sc.nextInt();

            //second array   
            int m = Sc.nextInt();
            int nums2[] = new int[m];
            for( int i=0 ; i<m ; i++ )
                nums2[i] = Sc.nextInt();
            
            //call solution class 
            Solution sl=new Solution();
            int arr[]=sl.intersect( nums1, nums2 );

            //print the intersection array element
            for( int i=0 ; i<arr.length ; i++ )
                System.out.print( arr[i]+" " ); 
        }
    }
}