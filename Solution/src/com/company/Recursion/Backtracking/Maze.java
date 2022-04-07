package com.company.Recursion.Backtracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(count(2,2));
//        maze2(" ",3,3);
//        System.out.println(maze2List(" ",3,3));
//        mazeDiagonal(" ",3,3);
        boolean [][]arr={
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        MazeRestiction(" ",arr,0,0);
    }

    static int count(int row, int col)
    {
        if(row==1 || col==1)
        {
            return 1;
        }
        int right = count(row,col-1);
        int down = count(row-1,col);
        return right+down;
    }

    static void maze2(String p, int r, int col)
    {
        if(r==1 && col==1)
        {
            System.out.println(p);
            return;
        }
        if(r>1)
        {
            maze2(p+'D',r-1,col);
        }
        if(col>1)
        {
            maze2(p+'R',r,col-1);
        }
    }


    static ArrayList<String> maze2List(String p, int r, int col)
    {
        if(r==1 && col==1)
        {
            ArrayList<String>list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String>list = new ArrayList<>();
        if(r>1)
        {
            list.addAll(maze2List(p+'D',r-1,col));
        }
        if(col>1)
        {
            list.addAll(maze2List(p+'R',r,col-1));
        }

        return list;
    }

    ////Including Diagonally path also
    static void mazeDiagonal(String p, int r, int col)
    {
        if(r==1 && col==1)
        {
            System.out.println(p);
            return;
        }
        if(r>1)
        {
            mazeDiagonal(p+'D',r-1,col);
        }
        if(col>1)
        {
            mazeDiagonal(p+'R',r,col-1);
        }
        if(r>1&&col>1)
        {
            mazeDiagonal(p+'A',r-1,col-1);
        }
    }

    //Maze with Obstackle
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
        if(r<arr.length-1)
        {
            MazeRestiction(p+'D',arr,r+1,col);
        }
        if(col< arr[0].length-1)
        {
            MazeRestiction(p+'R',arr,r,col+1);
        }
    }


}
