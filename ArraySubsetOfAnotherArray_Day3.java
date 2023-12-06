//https://practice.geeksforgeeks.org/problems/array-subset-of-another-array2317/0

import java.util.*;

class ArraySubsetOfAnotherArray_Day3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a1[]=new int[n];
        int a2[]=new int[m];
        System.out.println("1st array");    
        for (int i=0; i<n; i++)
        {
            a1[i]=sc.nextInt();
        }
        System.out.println("2nd array");   
        for (int i=0; i<m; i++)
        {
            a2[i]=sc.nextInt();
        }
        sc.close();

        int flag = 0;
        ArrayList <Integer> check = new ArrayList<>();
        for (int i =0 ;i<n;i++)
        {
            check.add(a1[i]);
        }     
        for (int i = 0; i<m;i++)
        {
            if (check.contains(Integer.valueOf(a2[i])))
            {
                check.remove(Integer.valueOf(a2[i]));
            }
            else
            {
                System.out.println("No");
                flag=1;
                break;
            }
        }
        if (flag == 0)
        {
            System.out.println("Yes");        
        }
    }
    
}
