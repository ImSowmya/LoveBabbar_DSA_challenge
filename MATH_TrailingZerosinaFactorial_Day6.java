import java.util.*;
class MATH_TrailingZerosinaFactorial_Day6 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        
        int res=0;
        for(int i=5; i<=num; i=i*5) res = res+(num/i);
        System.out.println(res);
    }    
}
