//https://leetcode.com/problems/find-in-mountain-array/description/

class FindInMountainArray_Day8 
{
    public static void main(String[] args) 
    {
        int arr[] = {1,2,3,4,5,3,1};
        int target = 3;

        int peak = findPeak(arr, 0, arr.length-1);
        int rise = binarySearch(arr, target, 0, peak, true);
        if (rise == -1)
        {
            int slope = binarySearch(arr, target, peak+1, arr.length-1, false);
            System.out.println(slope);
        }
        else System.out.println(rise);
    }

    static int findPeak(int [] arr, int start, int end)
    {
        if (start==end) return start;
        int mid = (start+end)/2;
        if (arr[mid] > arr [mid+1]) return findPeak(arr, start, mid);
        else return findPeak(arr, mid+1, end);
    }

    static int binarySearch(int [] arr, int target, int start, int end, boolean asc)
    {
        if (start>end) return -1;
        int mid = (start+end)/2;
        if (arr[mid] == target) return mid;
        if(asc)
        {
            if(target<arr[mid]) return binarySearch(arr, target, start, mid-1, asc);
            else return binarySearch(arr, target, mid+1, end, asc);
        }
        else
        {
            if(target<arr[mid]) return binarySearch(arr, target, mid+1, end, asc);
            else return binarySearch(arr, target, start, mid-1, asc);
        }
    }
}