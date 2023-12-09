//https://leetcode.com/problems/largest-odd-number-in-string

import java.util.*;
class LargestOddNumberinString 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        String num = sc.next();
        sc.close();

        System.out.println(Solution(num));
    }

    static String Solution(String num)
    {
        if ((int) num.charAt(num.length()-1)%2==1) return num;
        int i = num.length()-1;
        while(i>=0)
        {
            if ((int) num.charAt(i)%2==1) return num.substring(0, i+1);
            i--;
        }
        return "Nope!";
    }
}