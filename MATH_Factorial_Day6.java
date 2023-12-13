import java.util.*;
class MATH_Factorial_Day6 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        // int res = 1;
        // for(int i=2; i<=num; i++) res *=i;
        // System.out.println("The factorial of "+num+" number is "+res+".");

        System.out.println("The factorial of "+num+" number is "+Factorial(num)+".");
    }
    static int Factorial (int num)
    {
        if (num == 1) return num;
        return Factorial(num-1) * num;
    }
}