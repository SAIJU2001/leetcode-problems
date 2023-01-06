/*      217. Contains Duplicate.
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:
Input: nums = [1,2,3,1]
Output: true

Example 2:
Input: nums = [1,2,3,4]
Output: false

Example 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true

Constraints:
1 <= nums.length <= 105
-109 <= nums[i] <= 109          */


import java.util.Scanner;
import java.util.HashSet;

//this is the solution
class Solution 
{
    public boolean containsDuplicate(int[] nums) 
    {
        HashSet<Integer>set=new HashSet<>();
        for( int i=0 ; i<nums.length ; i++ )
            set.add(nums[i]);
        
        if(set.size()==nums.length)
            return false;
        else
            return true;
    }
}

//main class for this program
public class Question217
{
    public static void main(String args[])
    {
        Scanner Sc =new Scanner(System.in);
        int t=Sc.nextInt();
        while(t-->0)
        {
            int index = Sc.nextInt();
            int nums[] = new int[index];
            for( int i=0 ; i<index ; i++ )
                nums[i]=Sc.nextInt();

            Solution sl=new Solution();
            System.out.print(sl.containsDuplicate(nums));
        }
    }
}