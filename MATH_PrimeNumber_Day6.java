import java.util.*;
class MATH_PrimeNumber_Day6 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        
        System.out.println(isPrime(num));
    }

    static boolean isPrime(int num)
    {
        if(num==1) return false;
        if(num == 2 || num==3) return true;
        if(num%2==0 || num%3==0) return false;
        for(int i=5; i*i<=num; i=i+6) if(num%i==0 || num%(i+2)==0) return false;
        return true;
    }
}
