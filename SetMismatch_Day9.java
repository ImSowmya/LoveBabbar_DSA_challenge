// https://leetcode.com/problems/set-mismatch/description/

import java.util.Arrays;

class SetMismatch_Day9 
{
    public static void main(String[] args) 
    {
        int [] nums = {1,2,2,4,};
        System.out.println ( Arrays.toString (cyclicSort(nums)) );       
    }

    static int [] cyclicSort(int [] nums)
    {
        int i = 0;
        int [] arr = new int[2];
        while(i < nums.length)
        {
            int index = nums[i]-1;
            if (nums[i] != nums[index])
            {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            }
            else i++;
        }

        for (int j=0; j<nums.length; j++)
        {
            if( nums[j] != j+1) 
            {
                arr[1] = j+1;
                arr[0] = nums[j];
            }
        }
        return arr;
    }
}
