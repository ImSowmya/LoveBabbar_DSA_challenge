//https://practice.geeksforgeeks.org/problems/minimize-the-heights3351/0

import java.util.*;
class MinimizeTheHeightsII_Day3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int[n];
        for (int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }  
        int k = sc.nextInt();
        sc.close();

        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[n-1];

        int dif = max-min;

        for(int i=1; i<n; i++)
        {
            if((arr[i]-k)<0)
            {
                continue;
            }
            else
            {
                min=Math.min(arr[i]-k,arr[0]+k);
                max = Math.max(arr[i-1]+k,arr[n-1]-k);
                if(dif>(max-min))
                {
                    dif = max-min;
                }
            }
        }
        System.out.println(dif);
    }
}