import java.util.*;
class MATH_GCD_Day6 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        
        int res = Math.min(a, b);
        while (res > 0)
        {
            if( a % res == 0 && b % res == 0)
            {
                System.out.println(res);
                break;
            }
            res--;
        }
    }    
}
