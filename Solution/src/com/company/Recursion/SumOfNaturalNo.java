package com.company.Recursion;

public class SumOfNaturalNo {
    public static void main(String[] args) {
        System.out.println(sum(10));

    }
    static int sum(int n)
    {
     if(n<=1)
     {
         return n;
     }
        return n+sum(n-1);
    }
}
