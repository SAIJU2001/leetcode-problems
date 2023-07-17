//leetcode

/*          169. Majority Element
Easy
15.6K
458
Companies
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.


Example 1:

Input: nums = [3,2,3]
Output: 3

Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 

Constraints:
n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109
 

Follow-up: Could you solve the problem in linear time and in O(1) space?
*/


import java.util.*;


//leetcode solution
class Solution 
{
    public int majorityElement(int[] nums) 
    {
        HashMap<Integer,Integer>map=new HashMap<>(); //key=element of the array,value=freequency of element
        int n=nums.length;
        for( int i=0 ; i<n ; i++ )
        {
            //frequency default is 0 and incremented by 1 every time appeare the element
            map.put( nums[i], map.getOrDefault( nums[i], 0)+1 );
        }
        n=n/2;
        for( Integer key : map.keySet() )
        {
            //check which element frequency is greater than half of the length of the array
            if( map.get(key)>n )
                return key;
        }
        return -1;
    }
}

//driver code
public class Question169
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int t=Sc.nextInt();
        while(t-->0 )
        {
            //enter the length of the array
            int n=Sc.nextInt();
            int nums[]=new int[n];
            //enter the element of the array
            for( int i=0 ; i<n ; i++ )
            {
                nums[i]=Sc.nextInt();
            }
            Solution sl=new Solution();
            System.out.print( sl.majorityElement(nums) );
        }
    }
}