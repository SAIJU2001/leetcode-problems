//leetcode 

/*      15. 3Sum
Medium
27.6K
2.5K
Companies
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.

Example 2:

Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.

Example 3:

Input: nums = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.
 
Constraints:
3 <= nums.length <= 3000
-105 <= nums[i] <= 105
*/

import java.util.*;

//solution for leetcode 
class Solution 
{
    public List<List<Integer>> threeSum(int[] nums) 
    {
        List<List<Integer>>list=new LinkedList<>();
        Arrays.sort(nums);                //at first sort the array
        for( int i=0 ; i<nums.length ; i++ )
        {
            //lets take array of index i is one element of sum
            //and the other elements are low and high
            //here uses the two pointer approach
            if( i==0 || ( i>0 && nums[i]!=nums[i-1]) )
            {
                int low=i+1,high=nums.length-1,sum=0-nums[i];
                while( low<high )
                {
                    if( nums[low]+nums[high]==sum )
                    {
                        //if found the sum then add the three value to the list
                        list.add( Arrays.asList(nums[i],nums[low],nums[high]));

                        //these while loops are used to avoid the duuplicate values
                        while( low<high && nums[low]==nums[low+1] )
                        {
                            low++;
                        }
                        while( low<high && nums[low]==nums[low+1] )
                        {
                            high--;
                        }
                        low++;
                        high--;
                    }
                    else if( nums[low]+nums[high]<sum )
                    {
                        //if sum is lesser then low pointer increase
                        low++;
                    }
                    else
                    {
                        //if sum is greter then high pointer decrease
                        high--;
                    }
                }
            }
        }
        return list;
    }
}

//driver code
public class Question15
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int t=Sc.nextInt();
        while( t-->0)
        {
            int n=Sc.nextInt();
            int nums[]=new int[n];
            for( int i=0 ; i<n ; i++ )
            {
                nums[i]=Sc.nextInt();
            }
            Solution sl=new Solution();
            List<List<Integer>>result=sl.threeSum( nums);
            System.out.print(result);
        }
    }
}