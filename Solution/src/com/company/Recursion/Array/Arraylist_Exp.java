package com.company.Recursion.Array;

import java.util.ArrayList;

public class Arraylist_Exp{
    public static void main(String[] args) {
        int [] arr={1,5,3,4,5,6,5};
        int val=5;
//        ArrayList<Integer>list=new ArrayList<>();
//        FindAll(arr,val,0,list);
//        ArrayList<Integer>ans = FindAll(arr,val,0,new ArrayList<>());
//        System.out.println(ans);
//        System.out.println(list);
        System.out.println(FindAll2(arr,val,0));

    }

//    static ArrayList FindAllIndex(int[] arr,int val, int index,ArrayList<Integer> list)
//    {
//        if(index== arr.length)
//        {
//            return list;
//        }
//        if(arr[index]==val){
//            list.add(index);
//        }
//        FindAllIndex(arr,val,index+1,list);
//    }

    static ArrayList<Integer> FindAll(int [] arr, int val, int index, ArrayList<Integer>list)
    {
        if(index== arr.length)
        {
            return list;
        }
        if(arr[index]==val){
            list.add(index);
        }
        return FindAll(arr,val,index+1,list);
    }

    static ArrayList<Integer> FindAll2(int [] arr, int val, int index)
    {
        ArrayList<Integer>list = new ArrayList<>();
        if(index== arr.length)
        {
            return list;
        }
        if(arr[index]==val){
            list.add(index);
        }
        ArrayList <Integer> ansBelow = FindAll2(arr,val,index+1);
        list.addAll(ansBelow);
        return list;
    }
}
