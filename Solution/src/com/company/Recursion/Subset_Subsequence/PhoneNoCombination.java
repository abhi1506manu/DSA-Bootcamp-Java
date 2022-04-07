package com.company.Recursion.Subset_Subsequence;

import java.util.ArrayList;

public class PhoneNoCombination {
    public static void main(String[] args) {
//        phone("","12");
//        System.out.println( phoneRet("","12"));
        ArrayList<String>list = phoneRet("","12");
        System.out.println(list);

    }


    static void phone(String p, String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0)- '0';
        for (int i =(digit-1)*3; i <digit*3 ; i++) {
            char ch = (char) ('a'+i );
            phone(p+ch,up.substring(1));

        }
    }

    static ArrayList<String> phoneRet(String p, String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String>ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        int digit = up.charAt(0)- '0';
        ArrayList<String>list = new ArrayList<>();

        for (int i =(digit-1)*3; i <digit*3 ; i++) {
            char ch = (char) ('a'+i );
            list.addAll(phoneRet(p+ch,up.substring(1)));

        }
        return list;
    }
}
