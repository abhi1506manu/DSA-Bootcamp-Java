package com.company.MathForDSA;

public class Check_Prime2 {
    public static void main(String[] args) {
        int n=31;
        boolean []arr= new boolean[n+1];
        sieves(n,arr);

    }
    static void sieves(int n, boolean [] arr)
    {
        for(int i=2; i*i<=n; i++)
        {
            if(!arr[i])
            {
                for(int j=i*2; j<=n; j+=i)
                {
                    arr[j]=true;
                }
            }
        }

        for(int i=2; i<=n; i++)
        {
            if(!arr[i]){
                System.out.print(i+" ");
            }
        }
    }

}
