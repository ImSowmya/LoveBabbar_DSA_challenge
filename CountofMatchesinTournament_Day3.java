//https://leetcode.com/problems/count-of-matches-in-tournament/

import java.util.*;

class CountofMatchesinTournament_Day3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        int match = 0;
        while(n>1)
        {
            if(n%2 == 0)
            {
                n=n/2;
                match=match+n;
            }
            else
            {
                n=n-1;
                n=n/2;
                match=match+n;
                n=n+1;
            }
        }
        System.out.println(match);
    }
    
}
