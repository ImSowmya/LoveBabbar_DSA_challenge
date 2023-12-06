//https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1
//https://leetcode.com/problems/kth-largest-element-in-an-array/
//https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1

import java.util.*;

class KthSmallestElement_Day3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner((System.in));
        int n = sc.nextInt();
        int arr [] = new int [n];
        for (int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        int k =sc.nextInt();
        sc.close();

        int temp=0;
        for(int i=0; i<n-1; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if (arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i]= arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(arr[k-1]);
    }
    
}
