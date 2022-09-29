/*      367. Valid Perfect Square
Given a positive integer num, write a function which returns True if num is a perfect square else False.

Follow up: Do not use any built-in library function such as sqrt.

Example 1:
Input: num = 16
Output: true

Example 2:
Input: num = 14
Output: false
 
Constraints:
1 <= num <= 2^31 - 1        */


import java.util.Scanner;

//solution for the leetcode

class Solution 
{
    public boolean isPerfectSquare(int num) 
    {    
        long low=0;
        long high=(long)num/2;
        long mid=0;
        
        if( num<=2 )
            return true;
        
        while( low<=high )
        {
            mid=(low+high)/2;
            
            if( mid*mid== num )
                return true;
            else if(  mid*mid> num)
                high=mid-1;
            else
                low=mid+1;
        }
        return false;
    }
}

//main class
public class Question367
{
    public static void main(String args[])
	{
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t-->0)
	    {
			int num =sc.nextInt();
			Solution g = new Solution();
			System.out.println(g.isPerfectSquare(num));
	    }
    }
}