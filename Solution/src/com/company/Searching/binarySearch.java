package com.company.Searching;

public class binarySearch {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int val = 11;
        System.out.println(binary(arr,6));
    }
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
}
