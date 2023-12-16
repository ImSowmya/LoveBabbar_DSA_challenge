//https://leetcode.com/problems/peak-index-in-a-mountain-array/

import java.util.*;
class PeakIndexInaMountainArray_Day7 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        int n= sc.nextInt();
        int arr [] = new int [n];
        for (int i=0; i<n; i++) arr[i] = sc.nextInt();
        sc.close();

        System.out.println(binarySearch(arr, 0, n-1));        
    }    

    static int binarySearch (int [] arr, int start, int end)
    {
        if (start==end) return start;
        int mid = (start+end)/2;
        if (arr [mid] < arr [mid+1]) return binarySearch(arr, mid+1, end);
        else return binarySearch(arr, start, mid);
    }
}
