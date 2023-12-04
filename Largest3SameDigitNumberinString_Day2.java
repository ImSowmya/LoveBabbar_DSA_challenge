//https://leetcode.com/problems/largest-3-same-digit-number-in-string/

import java.util.*;
class Largest3SameDigitNumberinString_Day2 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String num=sc.next();
        sc.close();

        char ans=0;
        int flag=0;
        for(int i=0;i<num.length()-2;i++)
        {
            if (num.charAt(i)==num.charAt(i+1))
            {
                if (num.charAt(i)==num.charAt(i+2))
                {
                    if((int)num.charAt(i)>(int)ans)
                    {
                        flag=1;
                        ans=num.charAt(i);
                    }
                }
            }
        }
        if (flag==0)
        {
            System.out.println("");
        }
        else
        {
            System.out.println(ans+""+ans+""+ans);
        }
    }  
}
