package com.company.Recursion;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1));

    }
    public static boolean isPowerOfTwo(int n) {
//        if(n==1)
//        {
//            return  true;
//        }
//        if(n>2)
//        {
//            if(n == Math.pow(2,))
//        }
        long i=1;
        while(i<n)
        {
            i = i*2;
        }
        return  i==n;

    }
}
