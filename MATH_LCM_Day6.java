import java.util.*;
class MATH_LCM_Day6 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        
        int max = Math.max(a,b);
        while (true)
        {
            if(max%a==0 && max%b==0)
            {
                System.out.println(max);
                break;
            }
            max++;
        }
    }
    
}
