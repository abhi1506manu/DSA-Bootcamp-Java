package com.company.Recursion;

public class Pattern1 {
    public static void main(String[] args) {
        triangle(5,0);

    }

    static void triangle(int row, int col)
    {
        if(row == 0)
        {
            return;
        }
        if(col < row)
        {

            triangle(row, col+1);
            System.out.print("*");
        }
        else{

            triangle(row-1,0);
            System.out.println();

        }


    }

    static void triangle2(int row, int col)
    {
        if(row == 0)
        {
            return;
        }
        if(col < row)
        {
            System.out.print("*");
            triangle(row, col+1);

        }
        else{
            System.out.println();
            triangle(row-1,0);


        }


    }
}
