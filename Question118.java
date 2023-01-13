/*      118. Pascal's Triangle
Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

Example 1:
Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

Example 2:
Input: numRows = 1
Output: [[1]]
 
Constraints:
1 <= numRows <= 30          */


import java.util.*;

//solution for leetcode
class Solution 
{
    public List<List<Integer>> generate(int numRows) 
    {
        List<List<Integer>>list = new ArrayList<List<Integer>>();
    
        for( int i=1 ; i<=numRows ; i++ )
        {
            ArrayList<Integer>row= new ArrayList<Integer>();
            for( int j=0 ; j<i ; j++ )
            {
                if( j==0 || j==i-1 )
                    row.add(1);
                else
                    row.add( list.get(i-2).get(j) + list.get(i-2).get(j-1) );
            }
            list.add(row);
        }
        return list;
    }
}

//main class for drive the solution
public class Question118
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        while(t-- > 0)
        {
            int numRows = Sc.nextInt();

            Solution sl = new Solution();
            List<List<Integer>>list=sl.generate( numRows );  
            
            for( int i=0 ; i<list.size() ; i++ )
            {
                //for required the gapping of adjacent element
                for( int j=0 ; j<=list.size()/2-i+1 ; j++ )
                    System.out.print( " " );
                //for printing the list element 
                for( int j=0 ; j<list.get(i).size() ; j++ )
                    System.out.print( list.get(i).get(j)+" " );
                
                System.out.println();
            }
        }
    }
}
