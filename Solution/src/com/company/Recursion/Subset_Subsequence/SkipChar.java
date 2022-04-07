package com.company.Recursion.Subset_Subsequence;

public class SkipChar {
    public static void main(String[] args) {
//        stream(" ","bacbab");
//        stream2("bacbab");
//        System.out.println(stream3("bapplebab"));
        System.out.println(skip_app("bappe"));
 }
//    static void stream(String p, String up)
//    {
//        if(up.isEmpty())
//        {
//            System.out.println(p);
//            return;
//        }
//        char ch = up.charAt(0);
//        if(ch =='b')
//        {
//            stream(p,up.substring(1));
//        }
//        else{
//            stream(p+ch,up.substring(1));
//        }
//    }

//    static String stream2(String up)
//    {
//        if(up.isEmpty())
//        {
//            return "";
//        }
//        char ch = up.charAt(0);
//        if(ch =='b')
//        {
//            return stream2(up.substring(1));
//        }
//        else{
//            return ch+stream2(up.substring(1));
//        }
//    }

    static String stream3(String up)
    {
        if(up.isEmpty())
        {
            return "";
        }
        if(up.startsWith("apple"))
        {
            return stream3(up.substring(5));
        }
        else{
            return up.charAt(0) + stream3(up.substring(1));
        }
    }

    static String skip_app(String up)
    {
        if(up.isEmpty())
        {
            return "";
        }
        if(up.startsWith("app") && !up.startsWith("apple"))
        {
            return skip_app(up.substring(3));
        }
        else{
            return up.charAt(0) + skip_app(up.substring(1));
        }
    }
}
