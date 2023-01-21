/*          1502. Can Make Arithmetic Progression From Sequence
A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.

Given an array of numbers arr, return true if the array can be rearranged to form an arithmetic progression. Otherwise, return false.

Example 1:
Input: arr = [3,5,1]
Output: true
Explanation: We can reorder the elements as [1,3,5] or [5,3,1] with differences 2 and -2 respectively, between each consecutive elements.

Example 2:
Input: arr = [1,2,4]
Output: false
Explanation: There is no way to reorder the elements to obtain an arithmetic progression.
 
Constraints:
2 <= arr.length <= 1000
-106 <= arr[i] <= 106               */

import java.util.*;

//leetcode solution
class Solution 
{
    public boolean canMakeArithmeticProgression(int[] arr) 
    {
        Arrays.sort(arr);
        int progress=arr[1]-arr[0];
        for( int i=0 ; i<arr.length-1 ; i++ )
        {
            if( arr[i+1]-arr[i]!=progress )
                return false;
        }
        return true;
    }
}

public class Question1502
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
             
            Solution sl=new Solution();
            boolean ans=sl.canMakeArithmeticProgression( arr); 
            System.out.print( ans);
        }
    }
}