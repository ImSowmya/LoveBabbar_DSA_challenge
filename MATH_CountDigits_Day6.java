import java.util.*;
class MATH_CountDigits_Day6 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int count = 0;
        while(num != 0)
        {
            num /= 10;
            count++;
        }
        System.out.println("The number provided has "+count+" digits");
    }
}