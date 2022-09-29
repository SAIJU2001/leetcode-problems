/*      189. Rotate Array.
Given an array, rotate the array to the right by k steps, where k is non-negative.

Example 1:
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

Example 2:
Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
 
Constraints:
1 <= nums.length <= 105
-231 <= nums[i] <= 231 - 1
0 <= k <= 105               
 
Follow up:
Try to come up with as many solutions as you can. There are at least three different ways to solve this problem.
Could you do it in-place with O(1) extra space?         */

import java.util.Scanner;

//this is the solution for leetcode

class Solution 
{
    public void rotate(int[] nums, int k) 
    {    
        k=k%nums.length;
        reverse( nums, 0 , nums.length-1-k );
        reverse( nums ,  nums.length-k  , nums.length-1 );
        reverse( nums , 0 , nums.length-1 );
    }
    
    public void reverse( int nums[], int low, int high )
    {
        while( low<=high )
        {
            int temp=nums[low];
            nums[low]=nums[high];
            nums[high]=temp;
            high--;
            low++;
        }
    }
}
//this is the main class
public class Question189
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        int t=Sc.nextInt();
        while(t-->0)
        {
            int n=Sc.nextInt(); //size of the array
            int nums[]=new int[n];  //array declaration

            for( int i=0 ; i<n ; i++ )  //input the element 
                nums[i]=Sc.nextInt();

            int k=Sc.nextInt(); //k value input

            Solution sl=new Solution();
            sl.rotate( nums, k);

            for( int i=0 ; i<n ; i++ )  //output the element 
                System.out.print(nums[i]+" ");
        }
    }
}