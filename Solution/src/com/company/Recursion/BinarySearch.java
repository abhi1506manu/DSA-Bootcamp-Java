package com.company.Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};
        int val=5;
        int ans= binary(arr,val,0, arr.length-1);
        System.out.println(ans);

    }
    static int binary(int [] arr,int val,int s,int e)
    {
        while(s<e)
        {
            int mid = s+(e-s)/2;
            if(arr[mid] == val)
            {
                return mid;
            }
            else if(arr[mid] > val)
            {
                return binary(arr,val,s,mid-1);
            }
            else{
                return binary(arr,val,mid+1,e);
            }
        }
        return -1;
    }
}
