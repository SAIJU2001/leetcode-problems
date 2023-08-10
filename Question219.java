//leetcode

/*      219. Contains Duplicate II
Easy
5.2K
2.8K
Companies
Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true

Example 2:

Input: nums = [1,0,1,1], k = 1
Output: true

Example 3:

Input: nums = [1,2,3,1,2,3], k = 2
Output: false
 
Constraints:
1 <= nums.length <= 105
-109 <= nums[i] <= 109
0 <= k <= 105
*/

import java.util.*;

//leetcode solution
class Solution 
{
    public boolean containsNearbyDuplicate(int[] nums, int k) 
    {
        HashMap<Integer,Integer>map=new HashMap<>();       //key=array element, value=index

        for( int i=0 ; i<nums.length ; i++ )
        {
            //every time check key is present or not 
            //menas the array element is present or not
            if( map.containsKey( nums[i]) && i-map.get( nums[i])<=k )
            {
                //if present then check their index difference is <= k 
                //if staisfied then return true
                return true;
            }
            else
            {
                //either add the value to the map
                map.put( nums[i], i );
            }
        }
        return false;
    }
}

//driver code
public class Question219
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int t=Sc.nextInt();
        while( t-->0 )
        {
            int n=Sc.nextInt();
            int nums[]=new int[n];
            for( int i=0 ; i<n ; i++ )
            {
                nums[i]=Sc.nextInt();
            }
            int k=Sc.nextInt();
            Solution sl=new Solution();
            boolean result=sl.containsNearbyDuplicate( nums, k);
            System.out.print( result);
        }
    }
}