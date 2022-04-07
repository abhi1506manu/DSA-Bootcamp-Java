package com.company.Recursion;

public class PrintNumber {
    public static void main(String[] args) {
        Num(10);
    }
    static void Num(int n)
    {
        if(n==0)
        {
            return ;
        }
        Num((n-1));
        System.out.print(n+" ");
    }
}
