/*          39. Combination Sum
Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.

The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the 
frequency
 of at least one of the chosen numbers is different.

The test cases are generated such that the number of unique combinations that sum up to target is less than 150 combinations for the given input.

Example 1:
Input: candidates = [2,3,6,7], target = 7
Output: [[2,2,3],[7]]
Explanation:
2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
7 is a candidate, and 7 = 7.
These are the only two combinations.

Example 2:
Input: candidates = [2,3,5], target = 8
Output: [[2,2,2,2],[2,3,3],[3,5]]

Example 3:
Input: candidates = [2], target = 1
Output: []
 
Constraints:
1 <= candidates.length <= 30
2 <= candidates[i] <= 40
All elements of candidates are distinct.
1 <= target <= 40                   */

import java.util.*;

//leetcode solution
class Solution 
{
    public List<List<Integer>> combinationSum(int[] candidates, int target) 
    {
        List<List<Integer>> ans=new ArrayList<>();
        combination( 0 , candidates, target, ans, new ArrayList<>() );

    return ans;
    }

    public void combination( int index , int candidates[], int target ,List<List<Integer>>ans ,ArrayList<Integer>list )
    {
        if( index==candidates.length )
        {
            if( target==0 )
                ans.add( new ArrayList<>(list) );

            return;
        }

        // pick
        if( candidates[index]<=target)
        {
            list.add(candidates[index]);
            combination( index , candidates, target-candidates[index], ans, list );
            list.remove( list.size()-1 );
        }

        // not pick
        combination( index+1 , candidates, target, ans, list );
    }
}

//for drive the solution Initial template for JAVA

public class Question39
{
    public static void main (String[] args) 
    {
        
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        while(t-- >0)
        {
            int n = Sc.nextInt();
            int candidates[]=new int[n];
            
            for(int i = 0; i <n ;i++)
                candidates[i]=Sc.nextInt();
                
            int target= Sc.nextInt();
            
            Solution ob = new Solution();
            List<List<Integer>> res = ob.combinationSum( candidates, target);

            if (res.size() == 0) {
    			System.out.print("Empty");
    		}
 
    		// Print all combinations stored in res.
    		for (int i = 0; i < res.size(); i++) 
            {
    			if (res.size() > 0) 
                {
    				System.out.print("(");
    				List<Integer> list = res.get(i);
    				for (int j = 0; j < list.size(); j++) 
                    {    
    					System.out.print( list.get(j));
    					if( j < list.size()-1)
    					    System.out.print(" ");
    				}
    				System.out.print(")");
    			}
    		}
    		System.out.println();
	    }
    }
}