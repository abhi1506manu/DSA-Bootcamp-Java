package com.company.MathForDSA;

public class SqureRoot {
    public static void main(String[] args) {
        int n=39;
        int p=3;
        System.out.printf("%.3f" ,squre(n,p));

    }
    static double squre(int n, int p)
    {
        int s=0;
        int e=n;
        double root =0.0;
        while (s<=e){
            int m = s+(e-s)/2;
            if(m*m == n)
            {
                return m;
            }
            if(m*m < n)
            {
                s=m+1;
            }
            else{
                e=m-1;
            }
        }

        double incr=0.1;
        for(int i=0; i<=p; i++)
        {
            while (root * root< n)
            {
                root += incr;
            }
            root -= incr;
            incr/=10;
        }

        return root;
    }
}
