//https://practice.geeksforgeeks.org/problems/move-all-negative-elements-to-end1/

import java.util.*;
class MoveAllNegativeElementsToEnd_Day4 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        int arr[] = new int [n];
        for (int i=0; i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();

        ArrayList <Integer> pos = new ArrayList <Integer> ();
        ArrayList <Integer> neg = new ArrayList <Integer> ();
        for (int i=0;i<n; i++)
        {
            if(arr[i]<0) neg.add(arr[i]);
            else pos.add(arr[i]);
        }
        int i=0;
        for(int num:pos) arr[i++] = num;
        for(int num:neg) arr[i++] = num;

        for (int j=0; j<n;j++)
        {
            System.out.print(arr[j]+" ");
        }
    }   
}