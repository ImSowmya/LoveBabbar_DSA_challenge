//https://leetcode.com/problems/reverse-words-in-a-string-iii/description/
//https://practice.geeksforgeeks.org/problems/reverse-each-word-in-a-given-string1001/0

import java.util.Scanner;

public class ReverseEachWordInAGivenString_Day1 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String S=sc.next();
        sc.close();

        String s1[]=S.split("\\.");
        StringBuilder s2= new StringBuilder();

        for( int i=0; i<s1.length; i++)
        {
            if(i!=s1.length-1)
            {
                StringBuilder temp= new StringBuilder(s1[i]);
                s2.append(temp.reverse()+".");
            }
            else
            {
                StringBuilder temp= new StringBuilder(s1[i]);
                s2.append(temp.reverse());
            }
        }

        System.out.println(s2);
    }
}