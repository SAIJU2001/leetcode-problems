//leetcode


/*      215. Kth Largest Element in an Array
Medium
14.5K
709
Companies
Given an integer array nums and an integer k, return the kth largest element in the array.

Note that it is the kth largest element in the sorted order, not the kth distinct element.

Can you solve it without sorting?

 
Example 1:

Input: nums = [3,2,1,5,6,4], k = 2
Output: 5

Example 2:

Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4
 

Constraints:

1 <= k <= nums.length <= 105
-104 <= nums[i] <= 104
*/

import java.util.*;

//solution for leetocde
class Solution 
{
    public int findKthLargest(int[] nums, int k) 
    {
        //approach 1 ==> Sorting
            /* 
                Arrays.sort(nums);
                return nums[nums.length-k];
            */

        //approach 2 ==> Priority Queue
            PriorityQueue<Integer>pq=new PriorityQueue<>();
            for( int i=0 ; i<nums.length ; i++ )
            {
                pq.add(nums[i]);
                if(pq.size()>k)
                    pq.remove(pq.peek());
            }
            return pq.peek();
    }
}

//Driver code
public class Question215
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int t=Sc.nextInt(); //testcase
        while( t-->0 )
        {
            int n=Sc.nextInt(); //length of the array
            int nums[]=new int[n];
            for( int i=0 ; i<n ; i++ )
            {
                nums[i]=Sc.nextInt();
            }
            int k=Sc.nextInt(); //enter the k
            Solution sl=new Solution();
            System.out.print( sl.findKthLargest( nums, k ) ); 
        }
    }
}
