import java.util.Arrays;

class ALGO_CyclicSort 
{
    public static void main(String[] args) 
    {
        //int [] arr = {3,87,125,2,0,-9};
        int [] arr = {4,2,3,1,5};
        System.out.println(Arrays.toString(cyclicSort(arr)));        
    }
    
    static int [] cyclicSort(int [] arr)
    {
        int i=0;
        while(i < arr.length)
        {
            int index = arr[i] - 1;
            if (arr[i] == arr[index]) i++;
            else
            {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
        }
        return arr;
    }
}
