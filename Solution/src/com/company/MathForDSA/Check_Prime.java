package com.company.MathForDSA;

public class Check_Prime {
    public static void main(String[] args) {
       int n=10;
       for (int i=1; i<=n; i++)
       {
           System.out.println(i +" is "+ check_prime(i));
       }
        System.out.println();

    }
    static boolean check_prime(int n)
    {
        if(n<2)
        {
            return false;
        }
        for(int i=2; i<=Math.sqrt(n); i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return  true;
    }
}
