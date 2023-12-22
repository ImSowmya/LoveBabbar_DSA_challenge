//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/

import java.util.ArrayList;

class FindAllNumbersDisappearedInanArray_Day9 {
    public static void main(String[] args) {
        int [] nums = {4,3,2,7,8,2,3,1};
        System.out.println(missingNumber(cyclicSort(nums)));
    }

    static int [] cyclicSort(int [] nums)
    {
        int i = 0;
        while(i < nums.length)
        {
            int index = nums[i] -1;
            if (nums[i] == nums[index]) i++;
            else
            {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            }
        }
        return nums;
    }

    static ArrayList <Integer> missingNumber (int [] nums)
    {
        ArrayList <Integer> ans = new ArrayList<Integer>();
        for(int i=0; i<nums.length; i++)
        {
            if (nums[i] != i+1) ans.add(i+1);
        }
        return ans;
    }
}
