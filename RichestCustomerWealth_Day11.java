public class RichestCustomerWealth_Day11 
{
    public static void main(String[] args) 
    {
        int [][] accounts = {{1,2,3},{3,2,1}};
        int max = 0;
        for (int i = 0; i<accounts.length; i++)
        {
            int temp = 0;
            for (int wealth : accounts[i])
            {
                temp += wealth;
            }
            if (temp > max) max = temp;
        }
        System.out.println(max);
    }
    
}
