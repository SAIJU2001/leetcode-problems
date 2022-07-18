/* 
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.

Example 1:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.

Constraints:

1 <= s.length <= 15
s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
It is guaranteed that s is a valid roman numeral in the range [1, 3999].

 simple Soln = O(n) time complxity*/ 
    
import java.util.*;

public class RomanToInt
{
    public static int romanToInt(String s) 
    {
        if(s==null || s.length()==0)
        return 0;
        char arr[] = s.toCharArray();// string.toCharArray() method converts this string into character array.
        int length = s.length();
        int decimalNum = 0;

        for(int i=length-1 ; i>=0 ; i-- )
        {
            if( i-1>=0 && arr[i]=='V' && arr[i-1]=='I' )
            {
                decimalNum += 4;
                i--;
                continue;
            }
            else if( i-1>=0 && arr[i]=='X' && arr[i-1]=='I' )
            {
                decimalNum += 9;
                i--;
                continue;
            }
            else if( i-1>=0 && arr[i]=='L' && arr[i-1]=='X' )
            {
                decimalNum += 40;
                i--;
                continue;
            }
            else if( i-1>=0 && arr[i]=='C' && arr[i-1]=='X' )
            {
                decimalNum += 90;
                i--;
                continue;
            }
            else if( i-1>=0 && arr[i]=='D' && arr[i-1]=='C' )
            {
                decimalNum+=400;
                i--;
                continue;
            }
            else if( i-1>=0 && arr[i]=='M' && arr[i-1]=='C' )
            {
                decimalNum+=900;
                i--;
                continue;
            }
            
            
        if(i>=0)
        {
            switch(arr[i])
                {
                    case 'I' :
                        decimalNum += 1;
                        break;
                    case 'V' :
                        decimalNum += 5;
                        break;
                    case 'X' :
                        decimalNum += 10;
                        break;
                    case 'L' :
                        decimalNum += 50;
                        break;
                    case 'C' :
                        decimalNum += 100;
                        break;
                    case 'D' :
                        decimalNum += 500;
                        break;
                    case 'M' :
                        decimalNum += 1000;
                        break;
                    default :
                        System.out.print("Invalid Roman Number "+arr[i]);
                        System.out.println();
                }      
        }
       }
       return decimalNum;
    }

       
    
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the roman number : ");
        String num = Sc.next();
        System.out.println();
        int n = romanToInt(num);
        System.out.print("\nThe equivalent Integer number of Roman number "+num+" is = "+n);
    }
}
        