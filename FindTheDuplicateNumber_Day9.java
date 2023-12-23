class FindTheDuplicateNumber_Day9 {
    public static void main(String[] args) {
        int [] nums = {3,1,3,4,2};
        System.out.println(duplicate(cyclicSort(nums)));
    }

    static int duplicate(int [] nums)
    {
        for(int i=0; i<nums.length; i++)
        {
            if (nums[i]!=i+1) return nums[i];
        }
        return -1;
    }

    static int [] cyclicSort(int [] nums)
    {
        int i = 0;
        while( i < nums.length)
        {
            int index = nums[i]-1;
            if (nums[i]==nums[index]) i++;
            else
            {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            }
        }
        return nums;
    }
}
