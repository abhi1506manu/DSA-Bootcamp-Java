package com.company.Recursion.Subset_Subsequence;

import java.util.ArrayList;

public class SubSequences{
    public static void main(String[] args) {
//        sequence(" ","abc");

//        System.out.println(sequence2(" ","abd"));
//        sequenceAscii(" ","abc");
        System.out.println(AsciRet(" ","abd"));


    }

//    static void sequence(String p, String up)
//    {
//        if (up.isEmpty()) {
//
//            System.out.println(p);
//            return;
//        }
//        char ch = up.charAt(0);
//        sequence(p+ch,up.substring(1));
//        sequence(p, up.substring(1));
//    }

    //    using Array list
    static ArrayList<String> sequence2(String p, String up)
    {
        if (up.isEmpty()) {
            ArrayList<String>list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList <String> first = sequence2(p+ch,up.substring(1));
        ArrayList <String> sec =  sequence2(p, up.substring(1));
        first.addAll(sec);
        return first;
    }

        static void sequenceAscii(String p, String up)
    {
        if (up.isEmpty()) {

            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        sequenceAscii(p+ch,up.substring(1));
        sequenceAscii(p, up.substring(1));
        sequenceAscii(p+(ch+0), up.substring(1));
    }

    static ArrayList<String> AsciRet(String p, String up)
    {
        if (up.isEmpty()) {
            ArrayList<String>list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList <String> first = AsciRet(p+ch,up.substring(1));
        ArrayList <String> sec =  AsciRet(p, up.substring(1));
        ArrayList<String> third = AsciRet(p+(ch+0),up.substring(1));
        first.addAll(sec);
        first.addAll(third);
        return first;
    }











}
