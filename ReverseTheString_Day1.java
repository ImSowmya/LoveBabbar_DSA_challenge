//https://practice.geeksforgeeks.org/problems/reverse-words-in-a-given-string5459/0
import java.util.*;

class ReverseTheString_Day1
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        String S=sc.next();
        sc.close();

        String s1[]=S.split("\\.");
        String s2="";
        for (int i=s1.length-1; i>=0 ; i--)
        {
            if(i!=0)
            {
                
                s2=s2+s1[i]+".";
            }
            else
            {
                s2=s2+s1[i];
            }
        }

        System.out.println(s2);

    }
}