//https://practice.geeksforgeeks.org/problems/palindromic-array-1587115620/0
import java.util.Scanner;

public class PalindromicArray_Day1 {
    public static void main(String args[])
	{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        sc.close();

	    int flag=0;
        for(int i=0;i<a.length;i++)
        {
            char a1[]=String.valueOf(a[i]).toCharArray();
            int start=0;
            int end=a1.length-1;
            while(start<=end)
            {
                if(a1[start]!=a1[end])
                {
                    flag=1;
                }
                start++;
                end--;
            }
            if (flag==1)
            {
                System.out.println("Not a palindrome array");
                break;
            }
        }
        if (flag==0)
        {
            System.out.println("Palindrome Array");
        }
    }
}