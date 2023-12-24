class pattern 
{
    public static void main(String[] args) 
    {
        pattern1 ();
        pattern2();
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

    static void pattern2()
    {
        int n = 9;
        for (int i = 1; i <= n; i++) 
        {
            
            if (i <= (n / 2)+1) 
            {
                for (int j = ((n/2)+1)-i; j > 0; j--)
                {
                    System.out.print(" ");
                }
                for (int j = i; j > 0; j--) 
                {
                    System.out.print("* ");
                }
            } 
            else 
            {
                for (int j = n/2-(n-i); j >0 ; j--)
                {
                    System.out.print(" ");
                }
                for (int j = n-i+1; j > 0; j--) 
                {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}