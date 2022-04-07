package com.company.Recursion.Backtracking;

import java.util.Arrays;

public class MazeBacktracking {
    public static void main(String[] args) {
        boolean [][]arr={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int[][]path=new int[arr.length][arr[0].length];
//        MazeRestiction(" ",arr,0,0,path,0);
        allPathPrint(" ",arr,0,0,path,1);

    }



    public static void MazeRestiction(String p,boolean[][]arr,int r, int col)
    {
        if(r== arr.length-1 && col == arr[0].length-1)
        {
            System.out.println(p);

            return;
        }
        if(arr[r][col]==false)
        {
            return;
        }
        arr[r][col]=false;
        if(r<arr.length-1)
        {
            MazeRestiction(p+'D',arr,r+1,col);
        }
        if(col < arr[0].length-1)
        {
            MazeRestiction(p+'R',arr,r,col+1);
        }
        if(r>0)
        {
            MazeRestiction(p+'U',arr,r-1,col);
        }
        if(col>0)
        {
            MazeRestiction(p+'L',arr,r,col-1);
        }
        arr[r][col] = true;
    }

    public static void allPathPrint(String p,boolean[][]arr,int r, int col,int[][]path,int steps)
    {
        if(r== arr.length-1 && col == arr[0].length-1)
        {
            for (int[] paaa:path) {
                System.out.println(Arrays.toString(paaa));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(arr[r][col]==false)
        {
            return;
        }
        arr[r][col]=false;
        path[r][col]=steps;
        if(r<arr.length-1)
        {
            allPathPrint(p+'D',arr,r+1,col,path,steps+1);
        }
        if(col < arr[0].length-1)
        {
            allPathPrint(p+'R',arr,r,col+1,path,steps+1);
        }
        if(r>0)
        {
            allPathPrint(p+'U',arr,r-1,col,path,steps+1);
        }
        if(col>0)
        {
            allPathPrint(p+'L',arr,r,col-1,path,steps+1);
        }
        arr[r][col] = true;
        path[r][col]=0;
    }
}
