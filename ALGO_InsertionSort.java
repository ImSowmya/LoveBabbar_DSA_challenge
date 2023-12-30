import java.util.Arrays;

class ALGO_InsertionSort {
    public static void main(String[] args) {
        int arr[] = { 3, 87, 125, 2, 0, -9 };
        // System.out.println(Arrays.toString(insertionSort(arr)));
        System.out.println(Arrays.toString(insertionSort(arr, arr.length - 1)));
    }

    static int[] insertionSort(int[] arr, int end) {
        // for(int i = 0; i<arr.length-1; i++)
        // {
        // for(int j=i+1; j>0; j--)
        // {
        // if(arr[j]<arr[j-1])
        // {
        // int temp = arr[j];
        // arr[j] = arr[j-1];
        // arr[j-1] = temp;
        // }
        // else break;
        // }
        // }
        // return arr;

        // if (end <= 0) return arr;
        // insertionSort(arr, end-1);

        // if (arr[end] < arr[end-1])
        // {
        // int temp = arr[end];
        // arr[end] = arr[end-1];
        // arr[end-1] = temp;
        // insertionSort(arr, end-1);
        // }
        // return arr;

        // Base case: if there's only one element or less, it's already sorted
        if (end <= 0) {
            return arr;
        }

        // Recursive case: sort the first n-1 elements
        insertionSort(arr, end - 1);

        // Insert the last element into its correct position in the sorted array
        int key = arr[end];
        int j = end - 1;

        // Shift elements greater than the key to the right
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }

        // Place the key in its correct position
        arr[j + 1] = key;
        return arr;
    }
}