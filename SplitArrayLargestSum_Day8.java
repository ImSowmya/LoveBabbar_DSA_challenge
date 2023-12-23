// https://leetcode.com/problems/split-array-largest-sum/
class SplitArrayLargestSum_Day8
{
    public static void main(String[] args) {
        int [] nums ={7,2,5,10,8};
        int k = 2;

        int start = 0, end = 0;
        for (int num : nums)
        {
            start = Math.max(start, num);
            end += num;
        }
        while (start < end)
        {
            int mid = (start+end)/2;
            int pieces = 1;
            int sum = 0;
            for (int num : nums)
            {
                if(num+sum > mid)
                {
                    sum = num;
                    pieces++;
                }
                else sum +=num;
            }
            if(pieces>k) start = mid+1;
            else end = mid;
        }
        System.out.println(start);  
    }
}