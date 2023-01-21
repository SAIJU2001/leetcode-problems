/*              1539. Kth Missing Positive Number
Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.

Return the kth positive integer that is missing from this array.

Example 1:
Input: arr = [2,3,4,7,11], k = 5
Output: 9
Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.

Example 2:
Input: arr = [1,2,3,4], k = 2
Output: 6
Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6.
 
Constraints:
1 <= arr.length <= 1000
1 <= arr[i] <= 1000
1 <= k <= 1000
arr[i] < arr[j] for 1 <= i < j <= arr.length
 
Follow up:
Could you solve this problem in less than O(n) complexity?          */

import java.util.*;

//leetcode solution
class Solution 
{
    public int findKthPositive(int[] arr, int k) 
    {
        int i=0;
        int missing=1;
        while( k>0 && i<arr.length )
        {
            if( missing==arr[i] )
                i++;
            else
                k--;

            missing++;
        }
        if( k!=0 )
            return arr[arr.length-1]+k;

        return missing-1;
    }
}


//for drive the solution main class
public class Question1539
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int t=Sc.nextInt();
        while( t--> 0 )
        {
            int n=Sc.nextInt();
            int arr[]=new int[n];

            for( int i=0 ; i<n ; i++ )
                arr[i]=Sc.nextInt();

            int k=Sc.nextInt();

            Solution sl=new Solution();
            System.out.print( "Kth Missing Positive Number is "+sl.findKthPositive( arr, k) );
        }
    }
}