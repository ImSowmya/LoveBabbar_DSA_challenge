import java.util.*;

class ALGO_MergeSort 
{
    public static void main(String[] args) 
    {
        int [] arr = {3, 87, 125, 2, 0, -9};
        mergeSort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));  
    }

    static void mergeSort( int [] arr)
    {
        if(arr.length <= 1) return;
        int mid = (arr.length/2);

        int [] left = Arrays.copyOfRange(arr, 0, mid);
        int [] right = Arrays.copyOfRange(arr, mid, arr.length);

        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right);
    }

    static void mergeSort( int arr [] , int start, int end)
    {
        if (end-start == 1) return;

        int mid = (start+end)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);
        merge(arr, start, mid, end);
    }
    

    static void merge (int [] arr, int [] left, int [] right)
    {
        int i = 0, j = 0, k = 0;

        while(i < left.length && j < right.length)
        {
            if(left[i] < right[j])
            {
                arr[k] = left[i];
                k++;
                i++;
            }
            else
            {
                arr[k] = right[j];
                k++;
                j++;
            }
        }
        
        while(i < left.length)
        {
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j < right.length)
        {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    static void merge (int [] arr, int start, int mid, int end)
    {
        int mix [] = new int[end-start];
        int k = 0;
        int i = start;
        int j = mid;
        while (i < mid && j < end )
        {
            if (arr[i] < arr[j])
            {
                mix[k] = arr[i];
                k++;
                i++;
            }
            else
            {
                mix[k] = arr[j];
                k++;
                j++;
            }
        }
        while(i < mid)
        {
            mix[k] = arr[i];
            k++;
            i++;
        }
        while(j < end)
        {
            mix[k] = arr[j];
            k++;
            j++;
        }

        for (int l = 0; l<mix.length; l++)
        {
            arr[start+l] = mix[l];
        }
    }
    
}

