//https://www.geeksforgeeks.org/problems/how-many-xs4514/1

import java.util.*;
class HowManyXs_Day4 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L=sc.nextInt();
        int R=sc.nextInt();
        int X=sc.nextInt();
        sc.close();

        int quo;
        int count=0;
        for(int i=L+1; i<R; i++)
        {
            quo=i;
            while(quo>0)
            {
                if((quo%10)==X) count++;
                quo/=10;
            }
        }
        System.out.println(count);
    }
    
}
