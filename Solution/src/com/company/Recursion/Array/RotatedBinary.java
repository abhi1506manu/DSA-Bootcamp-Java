package com.company.Recursion.Array;

public class RotatedBinary {
    public static void main(String[] args) {
        int [] arr={5,6,7,8,9,1,2,3};
        System.out.println(binary(arr,5,0, arr.length-1));

    }

    static int binary(int [] arr, int tar, int s,int e)
    {
        if(s>e)
        {
            return  -1;
        }

        int mid= s+(e-s)/2;
        if(arr[mid] == tar)
        {
            return mid;
        }

        if(arr[s] <= arr[mid])
        {
            if(tar >= arr[s] && tar<=arr[e]){
                return binary(arr,tar,0,mid-1);
            }
            else{
                return binary(arr,tar,mid+1,e);
            }
        }

        if(tar >= arr[mid] && tar<=arr[e])
        {
            return binary(arr,tar,mid+1,e);
        }
        return binary(arr,tar,0,mid-1);

    }
}
