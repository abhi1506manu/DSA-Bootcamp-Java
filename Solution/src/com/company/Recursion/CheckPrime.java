package com.company.Recursion;

public class CheckPrime {
    public static void main(String[] args) {
        System.out.println(CheckPrime(15,2));

    }
    static boolean CheckPrime(int n, int i) {
        if (n <= 2) {
            return (n== 2 ? true : false);
        }
        if(n%i==0)
        {
            return false;
        }
        if(i*i>n)
        {
            return true;
        }
        return CheckPrime(n,i+1);
    }
}
