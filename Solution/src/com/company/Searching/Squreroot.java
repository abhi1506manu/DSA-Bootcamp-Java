package com.company.Searching;

//https://leetcode.com/problems/sqrtx/
public class Squreroot {

    public static void main(String[] args) {
        System.out.println(mySqrt(39));
    }
    public static int mySqrt(int x) {
        if (x < 2) {
            return x;

        } else {
            int ans=0;
            int s = 1;
            int e = x / 2;
            while (s < e) {
                int mid = s + (e - s) / 2;
                if (mid * mid == x) {
                    return mid;
                } else if (mid * mid < x) {
                    ans = mid;
                    s = mid + 1;
                } else {
                    e = mid;
                }
            }
            return ans;
        }
    }
}