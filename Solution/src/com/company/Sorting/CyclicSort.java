package com.company.Sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int arr[]= {5,1,3,4,2};
        Cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void Cyclic(int [] arr)
    {
        int i=0;
        while(i< arr.length-1)
        {
            int correctIndex  = arr[i]-1;
            if(arr[i]!=arr[correctIndex])
            {
                swap(arr,i,correctIndex);
            }
            else{
                i++;
            }
        }
    }

    static void swap(int[]arr,int first,int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
