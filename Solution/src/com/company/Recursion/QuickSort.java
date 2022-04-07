package com.company.Recursion;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int []arr={5,2,1,3,6,4};
        Quick(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    static void Quick(int [] arr, int l, int h )
    {
        if( l>=h)
        {
            return;
        }
        int s=l;
        int e=h;
        int m = s+(e-s)/2;
        int piv =arr[m];

        while(s<=e) {
            while (arr[s] < piv) {
                s++;

            }
            while (arr[e] > piv) {
                e--;
            }

            if(s<=e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        Quick(arr,l,e);
        Quick(arr,s,h);

    }
}
