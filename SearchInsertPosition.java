//https://leetcode.com/problems/search-insert-position/description/
//CEILING OF A TARGET NUMBER IN AN ARRAY

import java.util.*;
class SearchInsertPosition 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for(int i=0; i<n; i++) nums[i]=sc.nextInt();
        int target = sc.nextInt(); 
        sc.close();

        int start=0, end=n-1;
        System.out.println(binarySearch(nums, target, start, end));
    }

    static int binarySearch( int [] nums, int target, int start, int end)
    {
        int mid = (start+end)/2;
        if (start > end) return start;
        if (nums[mid] == target) return mid;
        else if (nums[mid] > target) return binarySearch(nums, target, start, mid-1);
        else return binarySearch(nums, target, mid+1, end);
    }
}

// IF THEY ASK FOR FLOOR OF A NUMBER IN AN ARRAY, RETURN END INSTEAD OF START.