package com.company.Recursion;

public class Print {
    public static void main(String[] args) {
//        print(5);
//        System.out.println(fact(5));
//        System.out.println(sumOfdigit(12345));
        System.out.println(prod(12345));

    }
    static void print(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.print(n+" ");
        print(n-1);

    }

    static int fact(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        return  n*fact(n-1) ;
    }

    static int sumOfdigit(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return (n%10)+sumOfdigit(n/10);
    }
    static int prod(int n)
    {
        if(n<10)
        {
            return n;
        }
        return (n%10) * prod(n/10);
    }

}
