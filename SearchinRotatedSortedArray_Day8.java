//https://leetcode.com/problems/search-in-rotated-sorted-array/description/

class SearchinRotatedSortedArray_Day8 
{
    public static void main(String[] args) 
    {
        int [] nums = {4,5,6,7,0,1,2};
        int target = 0;

        int pivot = findPivot(nums, 0, nums.length);
        if (pivot == -1) System.out.println(binarySearch(nums, target, 0, nums.length));
        if (target == nums[pivot]) System.out.println(pivot);
        if (target >= nums[0]) System.out.println(binarySearch(nums, target, 0, pivot-1));
        else System.out.println(binarySearch(nums, target, pivot+1, nums.length));
    }

    static int binarySearch(int[]nums, int target, int start, int end)
    {
        while(start<=end)
        {
            int mid = (start+end)/2;
            if (target == nums[mid]) return mid;
            else if (target < nums[mid]) end = mid-1;
            else start = mid+1;
        }
        return -1;
    }

    static int findPivot(int[] nums, int start, int end)
    {
        while (start <= end)
        {
            int mid = (start+end)/2;
            if (nums[mid]>nums[mid+1]) return mid;
            if (nums[mid]<nums[mid-1]) return mid-1;
            if (nums[start]<nums[mid]) start = mid;
            else end = mid-1;
        }
        return -1;
    }
    
}
