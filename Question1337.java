//leetcode

/*  1337. The K Weakest Rows in a Matrix
Easy
3.3K
201
Companies
You are given an m x n binary matrix mat of 1's (representing soldiers) and 0's (representing civilians). The soldiers are positioned in front of the civilians. That is, all the 1's will appear to the left of all the 0's in each row.

A row i is weaker than a row j if one of the following is true:

The number of soldiers in row i is less than the number of soldiers in row j.
Both rows have the same number of soldiers and i < j.
Return the indices of the k weakest rows in the matrix ordered from weakest to strongest.

Example 1:

Input: mat = 
[[1,1,0,0,0],
 [1,1,1,1,0],
 [1,0,0,0,0],
 [1,1,0,0,0],
 [1,1,1,1,1]], 
k = 3
Output: [2,0,3]
Explanation: 
The number of soldiers in each row is: 
- Row 0: 2 
- Row 1: 4 
- Row 2: 1 
- Row 3: 2 
- Row 4: 5 
The rows ordered from weakest to strongest are [2,0,3,1,4].

Example 2:

Input: mat = 
[[1,0,0,0],
 [1,1,1,1],
 [1,0,0,0],
 [1,0,0,0]], 
k = 2
Output: [0,2]
Explanation: 
The number of soldiers in each row is: 
- Row 0: 1 
- Row 1: 4 
- Row 2: 1 
- Row 3: 1 
The rows ordered from weakest to strongest are [0,2,3,1].
 

Constraints:
m == mat.length
n == mat[i].length
2 <= n, m <= 100
1 <= k <= m
matrix[i][j] is either 0 or 1.
*/

import java.util.*;

//leetcode solution
class Pair implements Comparable <Pair>
{
    int soldier;
    int index;
    public Pair( int soldier, int index)    //create pair constructor
    {
        this.soldier=soldier;
        this.index=index;
    }

    //comparison and return +ve, -ve and equal
    @Override
    public int compareTo(Pair p2)
    {
        if( this.soldier==p2.soldier )  //if soldier count same for two indexes the less index then weaker
            return this.index-p2.index;
        else
            return this.soldier-p2.soldier; //soldier basis comparison
    }
}


class Solution 
{
    public int[] kWeakestRows(int[][] mat, int k) 
    {
        int arr[]=new int[k];
        //priorityqueue type is the object of pair class
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for( int i=0 ; i<mat.length ; i++ ) 
        {
            int count=0;
            for( int j=0 ; j<mat[0].length ; j++ )
            {
                //if soldier find increase the counter
                if( mat[i][j]==1 )
                    count++;
            }
            //add the values to the queue
            pq.add( new Pair( count, i) );
        }
        int i=0;
        while ( i<k )
        //add the values to the array from the ppek of the queue
            arr[i++] = pq.remove().index;
        
        return arr;
    }
}

// Driver code
class Question1337
{
	public static void main(String[] args)
	{
        Scanner Sc=new Scanner(System.in);
        int t=Sc.nextInt();
        while( t-->0 )
        {
            //enter the length of the array
            int row=Sc.nextInt();
            int col=Sc.nextInt();
            int mat[][] =new int[row][col];
            for( int i=0 ; i<row ; i++ )
            {
                for( int j=0 ; j<col ; j++ )
                {
                    //enter the array element
                    mat[i][j]=Sc.nextInt();
                }
            }
            //enter how many values you need (k)
            int k=Sc.nextInt();

            Solution sl=new Solution();
            int result[]=sl.kWeakestRows( mat, k);
            System.out.println("The k weakest rows are : ");
            for( int i=0 ; i<result.length ; i++ )
            {
                System.out.println(" Row : "+result[i] );
            }
        }
	}
}