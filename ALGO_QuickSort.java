import java.util.Arrays;

class ALGO_QuickSort 
{
    public static void main(String[] args) 
    {
        int [] arr = {3, 87, 125, 2, 0, -9};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int [] arr, int s, int e)
    {
        if (s >= e)
        {
            return;
        }

        int start = s;
        int end = e;
        int mid = (start+end)/2;
        int pivot = arr[mid];
        
        while (start <= end)
        {
            while (arr[start] < pivot) start++;
            while (arr[end] > pivot) end--;
            if (start <= end)
            {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        quickSort(arr, s, end);
        quickSort(arr, start, e);
    }
}