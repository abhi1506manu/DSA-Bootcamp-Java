package com.company.Searching;

public class ArrangingCoin {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));

    }
    public static int arrangeCoins(int n)
    {
        int count =0;
        int i=1;
        while(n>=i){
            count++;
            n = n - i;
            i++;
        }
        return  count;

    }
}
