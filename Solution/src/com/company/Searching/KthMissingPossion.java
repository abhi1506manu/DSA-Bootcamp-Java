package com.company.Searching;

public class KthMissingPossion {
    public static void main(String[] args) {
        int []arr= {2,3,4,7,11};
        int k=5;
        System.out.println(findkthPositive(arr,k));

    }
    public static int findkthPositive(int []arr, int k)
    {
        int s=0;
        int e= arr.length-1;
        int miss=0;
        while(s<=e)
        {
            int mid = s+(e-s)/2;
            if(arr[mid]-(mid+1) < k)
            {
                s = mid +1;
            }
            else{
                e = mid-1;
            }
        }
        if(e >=0){
            miss=arr[e] - (e+1);
        }
        else
        {
            return  k;
        }
        return arr[e]+(k-miss);

    }
}
