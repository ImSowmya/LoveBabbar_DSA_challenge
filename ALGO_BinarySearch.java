import java.util.*;
class ALGO_BinarySearch
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int arr [] = new int[n];
        for(int i=0; i<n; i++) arr[i]=sc.nextInt();
        int key = sc.nextInt();
        sc.close();

        int start = 0, end = n-1;
        System.out.println(BinarySearch(arr,key,start,end));
    }

    static int BinarySearch(int [] arr, int key, int start, int end)
    {
        if (start > end) return -1;
        int mid = (start+end)/2;

    if(arr[mid] == key) return mid;
    else if (arr[mid] < key ) return BinarySearch(arr, key, mid+1, end);
    else return BinarySearch(arr, key, start, mid-1);
    }

}