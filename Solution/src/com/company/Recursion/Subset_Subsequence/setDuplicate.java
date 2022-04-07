package com.company.Recursion.Subset_Subsequence;

import java.util.ArrayList;
import java.util.List;

public class setDuplicate {
    public static void main(String[] args) {
        int[]arr={1,2,2};
        List<List<Integer>>ans=SetDuplicate(arr);
        for(List<Integer> list:ans) {
            System.out.println(list);
        }
    }
    static List<List<Integer>> SetDuplicate(int []arr)
    {
        List<List<Integer>>outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int s=0;
        int e=0;
        for(int i=0; i< arr.length; i++)
        {
            s=0;
            if(i>0 && arr[i]==arr[i-1])
            {
                s=e+1;
            }
            e = outer.size()-1;
            int n = outer.size();
            for (int j = 0; j < n; j++) {
                List<Integer>Internal = new ArrayList<>(outer.get(j));
                Internal.add(arr[i]);
                outer.add(Internal);

            }
        }
        return  outer;
    }
}
