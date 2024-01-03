import java.util.Arrays;

class RunningSumOf1DArray 
{
    public static void main(String[] args) 
    {
        int nums [] = {1,1,1,1,1};
        int rs[] = new int [nums.length];
        for(int i=0; i<nums.length; i++)
        {
            if (i==0) rs[i]=nums[i];
            else rs[i]=rs[i-1]+nums[i];
        }        
        System.out.println(Arrays.toString(rs));
    }
    
}
