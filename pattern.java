class pattern 
{
    public static void main(String[] args) 
    {
        pattern1 ();
        
    }

    static void pattern1()
    {
        int n = 9;
        for (int i = 1; i <= n; i++) 
        {
            if (i <= (n / 2)+1) 
            {
                for (int j = i; j > 0; j--) 
                {
                    System.out.print("* ");
                }
            } 
            else 
            {
                for (int j = n-i+1; j > 0; j--) 
                {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}