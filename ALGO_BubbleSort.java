import java.util.Arrays;

class ALGO_BubbleSort
{
    public static void main(String[] args) {
        int [] arr = {3,87,125,2,0,-9};
        //int [] arr = {0,1,2,3,4,5};
        
        System.out.println(Arrays.toString(bubbleSort(arr, 0, arr.length-1)));
    }

    static int[] bubbleSort(int [] arr, int start, int end)
    {
        
        // for(int i=0; i<arr.length; i++)
        // {
        //     boolean swappped = false;
        //     for (int j=1; j<arr.length-i; j++)
        //     {
        //         if (arr[j] < arr[j-1])
        //         {
        //             int temp = arr[j];
        //             arr[j] = arr[j-1];
        //             arr[j-1] = temp;
        //             swappped = true;
        //         }
        //     }
        //     if (!swappped) break;
        // }
        // return arr;


        if (end == 0) return arr;
        if (start < end)
        {
            if (arr[start] > arr[start+1])
            {
                int temp = arr[start];
                arr[start] = arr[start+1];
                arr[start+1] = temp;
            }
            return bubbleSort(arr, start+1, end);
        }
        else return bubbleSort(arr, 0, end-1);
        
    }
}