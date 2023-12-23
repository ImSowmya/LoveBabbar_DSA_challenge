// https://leetcode.com/problems/first-missing-positive/description/

class FirstMissingPositive_Day9 
{
    public static void main(String[] args) 
    {
        int [] nums = {3,4,-1,1};
        System.out.println(duplicate(cyclicSort(nums)));        
    }

    static int[] cyclicSort(int [] nums)
    {
        int i=0;
        while(i < nums.length)
        {
            int index = nums[i]-1;
            if (nums[i] < nums.length && nums[i] >0 && nums[i] != nums[index])
            {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            }
            else i++;
        }
        return nums;
    }

    static int duplicate(int [] nums)
    {
        for (int i=0; i<nums.length; i++)
        {
            if (i+1 != nums[i]) return i+1;
        }
        return nums.length+1;
    }
    
}
