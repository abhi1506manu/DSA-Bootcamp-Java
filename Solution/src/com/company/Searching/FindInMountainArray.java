package com.company.Searching;

public class FindInMountainArray {
    public static void main(String[] args) {

    }
//    public  static int findInMountainArray(int target, MountainArray mountainArr) {
//
//    }
    public static int binary(int [] arr,int val)
    {
        int s = 0;
        int end = arr.length-1;
        while(s<end)
        {
            int mid = s+(end-s)/2;
            if(arr[mid] < val)
            {
                s = mid+1;
            }
            else if(arr[mid] > val){
                end = mid-1;
            }
            else{
                return  mid;
            }
        }
        return  -1;
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<end)
        {
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1])
            {

                end = mid;
            }
            else{
                start = mid+1;
            }

        }
        return  start;

    }
}
