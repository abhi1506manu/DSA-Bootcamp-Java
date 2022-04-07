package com.company.Recursion.Subset_Subsequence;

import java.util.ArrayList;

public class DiceThrow {
    public static void main(String[] args) {
        dice("",4);
        System.out.println(dice2("",5));

    }
    static void dice(String  p, int tar)
    {
        if(tar == 0)
        {
            System.out.println(p);
            return;
        }
        for (int i = 1; i <=6 && i<=tar ; i++) {
            dice(p+i,tar-i);

        }
    }

    static ArrayList<String> dice2(String  p, int tar)
    {
        if(tar == 0)
        {
            ArrayList<String>list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String>list = new ArrayList<>();
        for (int i = 1; i <=6 && i<=tar ; i++) {
            list.addAll(dice2(p+i,tar-i));

        }
        return list;
    }


    static ArrayList<String> dice2(String  p, int tar,int face)
    {
        if(tar == 0)
        {
            ArrayList<String>list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String>list = new ArrayList<>();
        for (int i = 1; i <=face && i<=tar ; i++) {
            list.addAll(dice2(p+i,tar-i,face));

        }
        return list;
    }
}
