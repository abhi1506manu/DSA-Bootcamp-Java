package com.company.Sorting;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int arr[]= {4,5,0,1,2};
//        missingNumber(arr);
//        System.out.println(Arrays.toString(arr));
        System.out.println(missingNumber(arr));

    }

    public static int missingNumber(int[] nums) {
        int j=0;

        while(j<nums.length)
        {
            int correctIndex = nums[j];
            if(nums[j] <nums.length && nums[j] != nums[correctIndex])
            {
                swap(nums,j,correctIndex);
            }
            else{
                j++;
            }

        }
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] != i)
            {
                return i;
            }

        }
        return  nums.length;
    }

    static void swap(int[]arr, int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
