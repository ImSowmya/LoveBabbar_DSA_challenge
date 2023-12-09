//https://www.geeksforgeeks.org/problems/number-of-subarrays-with-maximum-values-in-given-range5949/1

import java.util.*;
class NumberofSubarraysWithMaximumValuesInGivenRange_Day5 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i=0; i<n; i++) a[i]=sc.nextInt();
        int L=sc.nextInt();
        int R = sc.nextInt();
        sc.close();

        int start=0, end=0, empire=0;
        long ans=0;

        for(end=0;end<n;end++)
        {
            if(a[end]>=L && a[end]<=R) empire=end-start+1;
            if(a[end]>R)
            {
                empire=0;
                start=end+1;
            }
            ans+=empire;
        }
        System.out.println(ans);
    }
}
