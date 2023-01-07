/*      733. Flood Fill
An image is represented by an m x n integer grid image where image[i][j] represents the pixel value of the image.

You are also given three integers sr, sc, and color. You should perform a flood fill on the image starting from the pixel image[sr][sc].

To perform a flood fill, consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel, plus any pixels connected 4-directionally to those pixels (also with the same color), and so on. Replace the color of all of the aforementioned pixels with color.

Return the modified image after performing the flood fill.

Example 1:

Input: image = [[1,1,1],[1,1,0],[1,0,1]], sr = 1, sc = 1, color = 2
Output: [[2,2,2],[2,2,0],[2,0,1]]
Explanation: From the center of the image with position (sr, sc) = (1, 1) (i.e., the red pixel), all pixels connected by a path of the same color as the starting pixel (i.e., the blue pixels) are colored with the new color.
Note the bottom corner is not colored 2, because it is not 4-directionally connected to the starting pixel.

Example 2:

Input: image = [[0,0,0],[0,0,0]], sr = 0, sc = 0, color = 0
Output: [[0,0,0],[0,0,0]]
Explanation: The starting pixel is already colored 0, so no changes are made to the image.
 
Constraints:
m == image.length
n == image[i].length
1 <= m, n <= 50
0 <= image[i][j], color < 216
0 <= sr < m
0 <= sc < n             */

import java.util.*;

//solution for leetcode
class Solution 
{
    public void dfs( int row, int col, int ans[][], int image[][], int delRow[], 
    int delCol[], int iniColor, int newColor )
    {
        ans[row][col]=newColor;
        int n=image.length;
        int m=image[0].length;

        for( int i=0 ; i<4 ; i++ )
        {   
            int nRow=row+delRow[i];
            int nCol=col+delCol[i];
        
            if( nRow>=0 && nCol>=0 && nRow<n && nCol<m && image[nRow][nCol]==iniColor
            && ans[nRow][nCol]!=newColor )
                dfs( nRow, nCol, ans, image, delRow, delCol, iniColor, newColor );
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) 
    {
        int iniColor=image[sr][sc];
        int ans[][]=image;
        int delRow[]={-1,0,1,0};
        int delCol[]={0,1,0,-1};
         dfs( sr, sc, ans, image, delRow, delCol, iniColor, color );
         return ans;
    }
}

//main method for drive the solution
public class  Question733
{
    public static void main(String[] args)
    {
        Scanner Sc = new Scanner(System.in);
        int T = Sc.nextInt();
        while(T-->0)
        {
            int n = Sc.nextInt();
            int m = Sc.nextInt();
            int[][] image =  new int[n][m];
            for(int i = 0; i < n; i++)
                for(int j = 0; j < m; j++)
                    image[i][j] = Sc.nextInt();
            
            int sr = Sc.nextInt();
            int sc = Sc.nextInt();
            int newColor = Sc.nextInt();
            Solution obj = new Solution();
            int[][] ans = obj.floodFill(image, sr, sc, newColor);
            for(int i = 0; i < ans.length; i++){
                for(int j = 0; j < ans[i].length; j++)
                    System.out.print(ans[i][j] + " ");
                System.out.println();
            }
        }
    }
}