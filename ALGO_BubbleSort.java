import java.util.Arrays;

class ALGO_BubbleSort
{
    public static void main(String[] args) {
        //int [] arr = {3,87,125,2,0,-9};
        int [] arr = {0,1,2,3,4,5};
        
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    static int[] bubbleSort(int [] arr)
    {
        
        for(int i=0; i<arr.length; i++)
        {
            boolean swappped = false;
            for (int j=1; j<arr.length-i; j++)
            {
                if (arr[j] < arr[j-1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swappped = true;
                }
            }
            if (!swappped) break;
        }
        return arr;
    }
}