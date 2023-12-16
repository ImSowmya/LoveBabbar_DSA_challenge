//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

import java.util.*;
class FindSmallestLetterGreaterThanTarget_Day7 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        char [] letters = new char [n];
        for(int i=0; i<n; i++) letters[i]=sc.next().charAt(0);
        char target = sc.next().charAt(0);
        sc.close();

        int start=0, end=n-1;
        System.out.println(binarySearch(letters, target, start, end));
    }

    static int binarySearch( char [] letters, int target, int start, int end)
    {
        int mid = (start+end)/2;
        if (start > end) return binarySearch(letters, target, start+1, end);
        if (letters[mid] == target) return mid;
        else if (letters[mid] > target) return binarySearch(letters, target, start, mid-1);
        else return binarySearch(letters, target, mid+1, end);
    }
    
}
