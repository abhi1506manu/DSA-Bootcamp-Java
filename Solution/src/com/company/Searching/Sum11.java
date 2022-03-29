package com.company.Searching;;

//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sum11 {
    public static void main(String [] args)
    {
        int [] arr = {1,2,3,4,5,6,7};
        int tar = 11;
        System.out.println(Arrays.toString(twoSum(arr,tar)));

    }
    public static int[] twoSum(int[] arr, int target) {
        int s = 0;
        int e = arr.length-1;
        while(s <= e ) {
            if(arr[s]+arr[e] < target ) {
                s++;
            }
            else if(arr[s]+arr[e] > target)
            {
                e--;
            }
            else{
                break;
            }
        }
        return new int[]{s+1,e+1};
    }


}
