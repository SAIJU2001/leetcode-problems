/* 121. Best Time to Buy and Sell Stock.
You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
 
Constraints:

1 <= prices.length <= 105
0 <= prices[i] <= 104       */

import java.util.*;

public class Question121 
{
    public static int maxProfit(int[] prices) 
    {
        int n=prices.length;
        int aux[]=new int[n];
        int maxprofit=0;
        int max=0;
        
       for( int i=n-1 ; i>=0 ; i-- )
        {
            if( prices[i]>max )
            {
                aux[i]=prices[i];
                max=prices[i];
            }
            else
                aux[i]=max;
        }
       for( int i=0 ; i<n ; i++ )
        {
            if( maxprofit<aux[i]-prices[i] )
            {
                maxprofit=aux[i]-prices[i] ;
            }
        }
        
        return maxprofit;
    }
    public static void main(String args[])
    {   
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the no of index you want : ");
        int length = Sc.nextInt();
        int prices[] = new int[length];
        System.out.println();
        for( int i=0 ; i<length ; i++)
            {
                System.out.print("Enter the value of index no "+i+" is : ");
                prices[i] = Sc.nextInt();
            }
            System.out.println();
        int maxprofit=maxProfit( prices );
        System.out.print("The max profit is : "+maxprofit);
    }
}