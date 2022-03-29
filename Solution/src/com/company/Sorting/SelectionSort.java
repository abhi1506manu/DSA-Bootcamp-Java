package com.company.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {5,3,2};
        Selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void Selection(int [] arr)
    {
        for(int i=0; i< arr.length; i++)
        {
            int last = arr.length-1;
            int m = maxi(arr);
            swap(arr,m,last);
        }
    }

    static int maxi(int [] arr) {

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= arr[max]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int [] arr,int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
