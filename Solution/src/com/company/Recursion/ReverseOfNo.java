package com.company.Recursion;

import com.sun.security.jgss.GSSUtil;

public class ReverseOfNo {
    public static void main(String[] args) {
        Reverse(12345);
        System.out.println(rev);
    }

    static int rev=0;
    static void  Reverse(int n)
    {
        if(n==0)
        {
            return;
        }
        int rem=n%10;
        rev = rev * 10+rem;
        Reverse(n/10);

    }
}
