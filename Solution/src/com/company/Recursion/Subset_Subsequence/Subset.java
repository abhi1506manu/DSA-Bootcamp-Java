package com.company.Recursion.Subset_Subsequence;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    public static void main(String[] args) {

        int[]arr={1,2,3};
        List<List<Integer>>list=Set(arr);
        System.out.println(list);
    }
    static List<List<Integer>> Set(int []arr)
    {
        List<List<Integer>>outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int num:arr)
        {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer>Internal = new ArrayList<>(outer.get(i));
                Internal.add(num);
                outer.add(Internal);

            }
        }
        return  outer;
    }
}
