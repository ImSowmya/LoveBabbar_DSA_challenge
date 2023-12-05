//https://www.geeksforgeeks.org/problems/value-equal-to-index-value1330/

import java.util.*;

class ValueEqualToIndexValue_Day2 
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();

        ArrayList <Integer> ans =new ArrayList<>();
        for(int i=0; i<n; i++)
        {
            if(arr[i]==i+1)
            {
                ans.add(i+1);
            }
        }

        System.out.println(ans);
    }
    
}
