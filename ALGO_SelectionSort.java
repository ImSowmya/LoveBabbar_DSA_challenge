import java.util.Arrays;

class ALGO_SelectionSort {
    public static void main(String[] args) {
        int [] arr = {3,87,125,2,0,-9};
        //int [] arr = {0,1,2,3,4,5};
        
        System.out.println(Arrays.toString(selectionSort(arr, 0, arr.length-1, 0)));
    }

    static int [] selectionSort(int [] arr, int start, int end, int max)
    {
        
        // for(int i=0; i<arr.length; i++)
        // {
        //     int max = 0;
        //     for(int j=1; j<arr.length-i; j++)
        //     {
        //         if (arr[j] > arr[max]) max = j;
        //     }
        //     int temp = arr[arr.length-i-1];
        //     arr[arr.length-i-1] = arr[max];
        //     arr[max] = temp;
        // }
        // return arr;

        if (end == 0) return arr;
        if (start <= end)
        {
            if (arr[max] < arr[start]) return selectionSort(arr, start+1, end, start);
            else return selectionSort(arr, start+1, end, max);
        }
        else
        {
            int temp = arr[end];
            arr[end] = arr[max];
            arr[max] = temp;
            return selectionSort(arr, 0, end-1, 0);
        }
    }
    
}
