// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

import java.util.*;
class NumberOfStepsToReduceANumberToZero_Day10
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        sc.close();
        System.out.println(Steps(num, 0));
    }

    static int Steps(int num, int steps)
    {
        if (num==0) return steps;
        if (num % 2 == 0) return Steps(num/2, ++steps);
        else return Steps(--num, ++steps);
    }
}