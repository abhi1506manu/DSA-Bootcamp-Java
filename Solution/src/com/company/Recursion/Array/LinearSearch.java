package com.company.Recursion.Array;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int []arr={1,5,3,7,5,9};
        int val = 5;
//        System.out.println(searching(arr,val,0));
//        System.out.println(search(arr,val,0));
//        System.out.println(searchinglast(arr,val, arr.length-1));
        FindAllIndex(arr,val,0);
        System.out.println(list);
    }
    static int searching(int[] arr,int val, int index)
    {
        if(index>= arr.length)
        {
            return -1;
        }
        if(arr[index]==val){
            return index;
        }
        return  searching(arr,val,index+1);
    }
    static int searchinglast(int[] arr,int val, int index)
    {
        if(index<0)
        {
            return -1;
        }
        if(arr[index]==val){
            return index;
        }
        return  searching(arr,val,index-1);
    }
    static boolean search(int[] arr,int val, int index)
    {
        if(index== arr.length)
        {
            return false;
        }

        return arr[index]==val || search(arr,val,index+1);
    }

    static ArrayList<Integer>list=new ArrayList<>();
    static void FindAllIndex(int[] arr,int val, int index)
    {
        if(index== arr.length)
        {
            return;
        }
        if(arr[index]==val){
            list.add(index);
        }
        FindAllIndex(arr,val,index+1);
    }
}
