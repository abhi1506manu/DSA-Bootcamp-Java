package com.company.Recursion;

public class CheckSorting {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println(Sorting(arr,0));
    }
    static boolean Sorting(int [] arr, int i)
    {
        if(i== arr.length-1)
        {
            return true;
        }
//        if(arr[i]<arr[i+1] && Sorting(arr,i+1))
//        {
//            return  true;
//        }
        return (arr[i]<arr[i+1] && Sorting(arr,i+1));
    }
}
