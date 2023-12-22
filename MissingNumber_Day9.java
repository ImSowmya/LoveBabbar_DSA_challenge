//https://leetcode.com/problems/missing-number/description/

class MissingNumber_Day9 {
    public static void main(String[] args) {
        int [] nums = {0,1,2,3};

        System.out.println(missingNumber(cyclicSort(nums)));
    }

    static int[] cyclicSort(int [] nums)
    {
        int i=0;
        while(i < nums.length)
        {
            int index = nums[i];
            if (nums[i] >= nums.length || nums[i] == nums[index]) i++;
            else{
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            }
        }
        return nums;
    }

    static int missingNumber(int [] nums)
    {
        for (int i=0; i<nums.length; i++)
        {
            if (i != nums[i]) return i;
        }
        return nums.length;
    }    
}
