package com.company.Searching;

public class GuessNo {
    public static void main(String[] args) {
        System.out.println(guessNumber(10,5));

    }
    public static int guessNumber(int n,int pick) {
        int s=1;
        int e = n;
        while(s<e)
        {
            int mid = s+(e-s)/2;
            if(mid == pick)
            {
                return mid;
            }
            else if(mid > pick) {
                e=mid - 1;
            }
            else{
                s = mid+1;
            }
        }
        return guess(n,pick);
    }

    public static int guess(int num , int pick)
    {
        if(num > pick)
        {
            return -1;
        }
        else if(num < pick)
        {
            return 1;
        }
        else{
            return 0;
        }
    }

}
