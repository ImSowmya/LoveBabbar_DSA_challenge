import java.util.*;
class MATH_PalindromeNumber 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int pal = sc.nextInt();
        sc.close();
        int rev=0;
        while(num!=0)
        {
            rev = (rev * 10)+ num % 10;
            num /= 10;
        }
        if( rev == pal) System.out.println("Yes");
        else System.out.println("No");
    }    
}
