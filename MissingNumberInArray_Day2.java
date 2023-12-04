//https://practice.geeksforgeeks.org/problems/missing-number-in-array1416/1

import java.util.*;
class MissingNumberInArray_Day2 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int dupn=sc.nextInt();
        int arr[]=new int[dupn];
        for (int i=0;i<dupn;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();

        int sum=0;
        int sumofn=n*(n+1)/2;
        for(int i=0;i<n-1;i++)
        {
            sum+=arr[i];
        }
        System.out.println(sumofn-sum);
    }
    
}
