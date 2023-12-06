//https://leetcode.com/problems/count-of-matches-in-tournament/

import java.util.*;
class CountOfMatchesInTournament_Day4 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        int match=0;
        while(n>1)
        {
            if(n%2==0)
            {
                n/=2;
                match=match+n;
            }
            else
            {
                n/=2;
                match=match+n;
                n++;
            }
        }
        System.out.println(match);
    }
    
}
