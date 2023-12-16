//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
import java.util.*;
class FindFirstAndLastPositionofElementinSortedArray_Day7 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for (int i=0; i<n; i++) nums[i]=sc.nextInt();
        int target = sc.nextInt();
        sc.close();

        int [] ans = {-1,-1};
        ans[0] = binarySearch(nums, target, true, 0, nums.length-1, -1);
        if (ans[0] != -1) ans [1] = binarySearch(nums, target, false, 0, nums.length-1, -1);
        System.out.println(Arrays.toString(ans));
    }

    static int binarySearch(int [] nums, int target, boolean startindex, int start, int end, int ans)
    {
        if (start>end) return ans;
        int mid = (start+end)/2;
        if(target < nums[mid]) return binarySearch(nums, target, startindex, start, mid-1, ans);
        else if (nums[mid] < target) return binarySearch(nums, target, startindex, mid+1, end, ans);
        else
        {
            ans = mid;
            if(startindex) return binarySearch(nums, target, startindex, start, mid-1, ans);
            else return binarySearch(nums, target, startindex, mid+1, end, ans);
        }
    }
    
}
