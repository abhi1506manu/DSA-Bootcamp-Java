package com.company.Recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int []arr = {5,3,1,4,2};
//        arr= mergeSort(arr);
//        System.out.println(Arrays.toString(arr));
        Sorting2(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));

    }

    static int[] mergeSort(int[]arr)
    {
        if(arr.length ==1)
        {
            return arr;
        }
        int mid = arr.length/2;

        int [] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int [] right= mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return  merge(left,right);
    }
    private static int[] merge(int []first,int []sec)
    {
        int[] mix = new int [first.length+ sec.length];
        int i=0,j=0,k=0;
        while (i< first.length && j< sec.length)
        {
            if(first[i]<sec[j])
            {
                mix[k] = first[i];
                i++;
            }
            else{
                mix[k]=sec[j];
                j++;
            }
            k++;
        }
        while(i< first.length)
        {
            mix[k] = first[i];
            i++;k++;
        }
        while(j< sec.length)
        {
            mix[k] = sec[j];
            j++;k++;
        }
        return mix;
    }


    static void Sorting2(int[]arr, int s, int e)
    {
        if(e-s==1)
        {
            return;
        }
        int m = (s+e)/2;
        Sorting2(arr,s,m);
        Sorting2(arr,m,e);
        Merge(arr,s,m, e);
    }

    static void Merge(int [] arr,int s,int m,int e)
    {
        int[] mix=new int [e-s];
        int i=s,j=m,k=0;

        while (i<m && j<e)
        {
            if(arr[i]<arr[j])
            {
                mix[k]=arr[i];
                i++;
            }
            else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<m)
        {
            mix[k] = arr[i];
            i++;k++;
        }
        while (j<e)
        {
            mix[k] = arr[j];
            j++;k++;
        }

        for(int p=0; p < mix.length; p++)
        {
            arr[s+p]=mix[p];
        }

    }

}
