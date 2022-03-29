package com.company.Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        Sorting(arr);
//        Selection(arr);
//        System.out.println("///Selection");
//        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr));
    }
    public static void Sorting(int []arr)
    {
        for(int i=0; i< arr.length; i++)
        {
            boolean swaped = false;
            for(int j=1; j< arr.length-i; j++)
            {
                if(arr[j] < arr[j-1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swaped = true;

                }
            }

            if(!swaped)
            {
                break;
            }
        }
    }
}
