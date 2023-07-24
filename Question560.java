//leetcode

/*  560. Subarray Sum Equals K
Medium
19K
556
Companies
Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

A subarray is a contiguous non-empty sequence of elements within an array.

Example 1:

Input: nums = [1,1,1], k = 2
Output: 2

Example 2:

Input: nums = [1,2,3], k = 3
Output: 2
 
Constraints:
1 <= nums.length <= 2 * 104
-1000 <= nums[i] <= 1000
-107 <= k <= 107
*/

import java.util.*;

//leetcode solution
class Solution 
{
    public int subarraySum(int[] nums, int k) 
    {
        //using hashmap
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);   //for tracking purpose
        int sum=0,ans=0;
        for( int i=0 ; i<nums.length ; i++ )
        {
            sum+=nums[i];
            //if sum-k present as a key in the map then the value is added to the ans 
            if( map.containsKey(sum-k) )
                ans+=map.get(sum-k);
            //add the sum and count value to the hashmap
            map.put(sum, map.getOrDefault(sum, 0)+1); 
        }
        return ans;
    }
}

// Driver code
public class Question560 
{
	public static void main(String[] args)
	{
        Scanner Sc=new Scanner(System.in);
        int t=Sc.nextInt();
        while( t-->0 )
        {
            //enter the length of the array
            int len=Sc.nextInt();
            int nums[] =new int[len];
            for( int i=0 ; i<len ; i++ )
            {
                nums[i]=Sc.nextInt();
            }
            //enter the value of k
            int k=Sc.nextInt();
            Solution sl=new Solution();
            System.out.println("Total number of subarrays whose sum equals to k is : "+sl.subarraySum( nums, k));
        }
	}
}