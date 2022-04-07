package com.company.Recursion;

public class CountZero {
    public static void main(String[] args) {
        System.out.println(Count2(24000));

    }

//    static  int count=0;
//    static int Count(int n)
//    {
//        if(n==0)
//        {
//            return count;
//        }
//        if(n%10 == 0)
//        {
//            count++;
//        }
//        Count(n/10);
//        return count;
//    }

    static int Count2(int n)
    {
        return countpart(n,0);
    }

    static  int countpart(int n, int c)
    {
        if(n==0)
        {
            return c;
        }
        int rem = n%10;
        if(rem == 0)
        {
            return countpart(n/10,c+1);
        }
        return  countpart(n/10,c);

    }
}
