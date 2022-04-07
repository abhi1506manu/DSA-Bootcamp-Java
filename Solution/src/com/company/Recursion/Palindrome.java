package com.company.Recursion;

public class Palindrome {
    public static void main(String[] args) {
        Reverse(1234321);
//        System.out.println(rev);

        System.out.println(palindrome(1234321));

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

    static boolean palindrome(int n)
    {
        return (n==rev);
    }

}
