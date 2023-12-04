//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

import java.util.Scanner;

class BestTimeToBuyAndSellStock_Day1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int prices[]=new int[n];
        for (int i=0;i<n;i++)
        {
            prices[i]=sc.nextInt();
        }
        sc.close();

        int smol=Integer.MAX_VALUE;
        int pist=0;
        int op=0;
        for (int i = 0 ; i < prices.length ; i++)
        {
            if(prices[i]<smol)
            {
                smol=prices[i];
            }
            pist=prices[i]-smol;
            if(pist>op)
            {
                op=pist;
            }
        }
        System.out.println(op);        
    }
}